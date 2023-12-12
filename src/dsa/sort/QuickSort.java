package dsa.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] numbers = {7, 3, 1, 4, 6, 2, 3, 7, 8, 2, 9, 9};
        sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void sort(int[] array) {
        sort(array, 0, array.length -1);
    }

    private static void sort(int[] array, int start, int end) {
        if (start >= end)
            return;
        var boundary = partition(array, start, end);
        sort(array, start, boundary - 1);
        sort(array, boundary + 1, end);


    }

    private static int partition(int[] array, int start, int end) {
        var pivot = array[end];
        var boundary = start - 1;
        for (int i = start; i <= end; i++)
            if (array[i] <= pivot)
                swap(array, i, ++boundary);
        return boundary;
    }

    private static void swap(int[] array, int index1, int index2) {
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
