package searching;

import sort.QuickSort;

import java.util.Arrays;

public class JumpSearch {
    public static void main(String[] args) {
        int[] numbers = {7, 1, 3, 6, 5};
        System.out.println(Arrays.toString(numbers));
        QuickSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        var index = jumpSearch(numbers, 7);
        System.out.println(index);
    }
    public static int jumpSearch(int[] array, int target) {
        int blockSize = (int) Math.sqrt(array.length);
        int start = 0;
        int next = blockSize;

        while (start < array.length && array[next - 1] < target) {
            start = next;
            next += blockSize;

            if (next > array.length)
                next = array.length;
        }

        for (int i = start; i < next; i++) {
            if (array[i] == target)
                return i;
        }
        return -1;
    }
}
