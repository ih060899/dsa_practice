package dsa.sort;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] numbers = {7, 3, 1, 4, 6, 2, 3, 7, 8, 2, 9, 9, 0, 0};
        sort(numbers, 9);
        System.out.println(Arrays.toString(numbers));
    }

    public static void sort(int[] array, int max) {
        int[] counts = new int[max + 1];
        for (var item : array) {
            counts[item]++;
        }
        var k = 0;
        for (int i = 0; i < counts.length; i++) {
            for (int j = 0; j < counts[i]; j++) {
                array[k++] = i;
            }
        }
    }
}
