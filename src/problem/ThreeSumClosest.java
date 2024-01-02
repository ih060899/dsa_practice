package problem;

//16. 3Sum Closest
//
//
//Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.
//
//Return the sum of the three integers.
//
//You may assume that each input would have exactly one solution.
//
//
//
//        Example 1:
//
//Input: nums = [-1,2,1,-4], target = 1
//Output: 2
//Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
//Example 2:
//
//Input: nums = [0,0,0], target = 1
//Output: 0
//Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
//
//
//Constraints:
//
//        3 <= nums.length <= 500
//        -1000 <= nums[i] <= 1000
//        -104 <= target <= 104

import java.util.Arrays;

public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        // Sorting given list
        Arrays.sort(nums);

        // Initializing closestsum variable to a large integer
        int closestsum = Integer.MAX_VALUE;

        // Traversing through the whole list
        for (int i = 0; i < nums.length - 2; i++) {
            // Defining Pointers left and right to get closestsum
            int left = i + 1, right = nums.length - 1;

            // Traversing through remaining elements of list for each i value
            while (left < right) {
                // Defining currentsum which will be used to compare with closestsum
                int currentsum = nums[i] + nums[left] + nums[right];

                if (Math.abs(currentsum - target) < Math.abs(closestsum - target)) {
                    closestsum = currentsum; // Assigning closest value to closestsum each time
                }

                if (currentsum < target) {
                    left++; // If closest sum is less than we need to add a higher element so move left pointer
                } else {
                    right--; // If closest sum is higher than we need to remove a higher element so move right pointer
                }
            }
        }
        return closestsum;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, 1, -4};
        int[] arr1 = {0, 0, 0};
        System.out.println(threeSumClosest(arr, 1));
        System.out.println(threeSumClosest(arr1, 1));
    }
}
