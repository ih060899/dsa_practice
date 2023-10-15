package problem;

import java.util.Arrays;

public class LeftRotateArray {
    public static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        int[] rotatedArr = new int[n];

        // Perform the left rotation
        for (int i = 0; i < n; i++) {
            int newIndex = (i + (n - k)) % n;
            rotatedArr[newIndex] = arr[i];
        }

        // Update the original array with the rotated elements
        for (int i = 0; i < n; i++) {
            arr[i] = rotatedArr[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2; // Number of positions to left rotate

        System.out.println("Original Array: " + Arrays.toString(arr));
        leftRotate(arr, k);
        System.out.println("Left Rotated Array: " + Arrays.toString(arr));
    }
}
