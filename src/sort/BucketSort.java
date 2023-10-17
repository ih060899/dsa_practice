package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    public static void main(String[] args) {
        int[] numbers = {7, 3, 1, 4, 6, 2, 3, 7, 8};
        sort(numbers, 3);
        double[] doubles = {0.42, 0.32, 0.33, 0.52, 0.37, 0.47, 0.51};
        bucketSort(doubles);
        System.out.println(Arrays.toString(doubles));
        System.out.println(Arrays.toString(numbers));
    }

    public static void bucketSort(double[] arr) {
        int n = arr.length;
        if (n <= 1) return;

        // Create an array of empty buckets
        List<Double>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Place elements into buckets
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) (n * arr[i]);
            buckets[bucketIndex].add(arr[i]);
        }

        // Sort each bucket
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }

        // Concatenate the buckets into the original array
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                arr[index++] = buckets[i].get(j);
            }
        }
    }

    public static void sort(int[] array, int numberOfBuckets) {
        var i = 0;
        for (var bucket : createBuckets(array, numberOfBuckets)) {
            Collections.sort(bucket);
            for (var item : bucket) {
                array[i++] = item;
            }
        }
    }

    private static List<List<Integer>> createBuckets(int[] array, int numberOfBuckets) {
        List<List<Integer>> buckets = new ArrayList<>();
        for (int i = 0; i <= numberOfBuckets; i++) {
            buckets.add(new ArrayList<>());
        }
        for (var item : array) {
            buckets.get(item / numberOfBuckets).add(item);
        }
        return buckets;
    }
}
