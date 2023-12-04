package problem;

public class MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Merge the sorted arrays into a single array
        int[] mergedArray = new int[nums1.length + nums2.length];

        int idxNums1 = 0; // Index for nums1
        int idxNums2 = 0; // Index for nums2

        // Merge the arrays while maintaining the sorted order
        for (int i = 0; i < mergedArray.length; i++) {
            if (idxNums2 < nums2.length && (idxNums1 == nums1.length || nums2[idxNums2] < nums1[idxNums1])) {
                mergedArray[i] = nums2[idxNums2++];
            } else {
                mergedArray[i] = nums1[idxNums1++];
            }
        }

        // Calculate the median of the merged array
        if (mergedArray.length % 2 == 1) {
            return mergedArray[mergedArray.length / 2];
        } else {
            return (mergedArray[mergedArray.length / 2] + mergedArray[mergedArray.length / 2 - 1]) / 2.0;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2};
        int[] arr2 = {3, 4};
        System.out.println(findMedianSortedArrays(arr1, arr2));
    }
}
