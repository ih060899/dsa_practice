package searching;

import sort.QuickSort;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {7, 1, 3, 6, 5};
        System.out.println(Arrays.toString(numbers));
        QuickSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));
//        var index = binarySearchRac(numbers, 5);
        var index = binarySearch(numbers, 7);
        System.out.println(index);
    }

    public static int binarySearch(int[] array, int target) {
        var left = 0;
        var right = array.length - 1;

        while (left <= right) {
            var middle = (left + right) / 2;
            if (array[middle] == target) {
                return middle;
            }
            if (target < array[middle])
                right = middle - 1;
            else left = middle + 1;
        }

        return -1;
    }

    public static int binarySearchRac(int[] array, int target) {
        return binarySearchRac(array, target, 0, array.length - 1);
    }


    private static int binarySearchRac(int[] array, int target, int left, int right) {
        if (right < left)
            return -1;
        int middle = (left + right) / 2;
        if (array[middle] == target)
            return middle;
        if (target < array[middle])
            return binarySearchRac(array, target, left, middle - 1);

        return binarySearchRac(array, target, middle + 1, right);
    }
}
