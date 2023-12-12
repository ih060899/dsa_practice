package dsa.searching;

import dsa.sort.QuickSort;

import java.util.Arrays;

public class TernarySearch {
    public static void main(String[] args) {
        int[] numbers = {7, 1, 3, 6, 5};
        System.out.println(Arrays.toString(numbers));
        QuickSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        var index = ternarySearch(numbers, 0);
        System.out.println(index);
    }

    public static int ternarySearch(int[] array, int target) {
        return ternarySearch(array, target, 0, array.length - 1);
    }

    private static int ternarySearch(int[] array, int target, int left, int right) {
        if (left > right)
            return -1;

        int partitionSize = (right - left) / 3;
        var mid1 = left + partitionSize;
        var mid2 = right - partitionSize;

        if (array[mid1] == target)
            return mid1;

        if (array[mid2] == target)
            return mid2;

        if (target < array[mid1])
            return ternarySearch(array, target, left, mid1 - 1);

        if (target > array[mid2])
            return ternarySearch(array, target, mid2 + 1, right);

        return ternarySearch(array, target, mid1 + 1, mid2 - 1);
    }
}
