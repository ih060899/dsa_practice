package dsa.searching;

import dsa.sort.QuickSort;

import java.util.Arrays;

public class ExponentialSearch {
    public static void main(String[] args) {
        int[] numbers = {7, 1, 3, 6, 5};
        System.out.println(Arrays.toString(numbers));
        QuickSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        var index = exponentialSearch(numbers, 6);
        System.out.println(index);
    }

    public static int exponentialSearch(int[] array, int target) {
        int bound = 1;
        while (bound < array.length && array[bound] < target) {
            bound *= 2;
        }
        var left = bound / 2;
        var right = Math.min(bound, array.length - 1);

        return BinarySearch.binarySearchRac(array, target,left, right);
    }

}
