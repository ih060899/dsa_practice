package problem;

//1287. Element Appearing More Than 25% In Sorted Array
//        Given an integer array sorted in non-decreasing order, there is exactly one integer in the array that occurs more than 25% of the time, return that integer.
//
//
//
//        Example 1:
//
//        Input: arr = [1,2,2,6,6,6,6,7,10]
//        Output: 6
//        Example 2:
//
//        Input: arr = [1,1]
//        Output: 1
//
//
//        Constraints:
//
//        1 <= arr.length <= 104
//        0 <= arr[i] <= 105

public class ElementAppearingMoreThan25PercentInSortedArray {
    public static int findSpecialInteger(int[] arr) {
        int size = arr.length;
        int qtr = size / 4;
        int cnt = 1;
        int p = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (p == arr[i])
                cnt++;
            else
                cnt = 1;

            if (cnt > qtr)
                return arr[i];

            p = arr[i];
        }
        return p;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 6, 6, 6, 6, 7, 10};
        int[] nums2 = {1, 1};
        System.out.println(findSpecialInteger(nums1));
        System.out.println(findSpecialInteger(nums2));
    }
}
