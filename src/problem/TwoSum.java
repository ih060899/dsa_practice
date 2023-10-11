package problem;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndex.containsKey(complement)) {
                return new int[]{numToIndex.get(complement), i};
            }
            numToIndex.put(nums[i], i);
        }

        throw new IllegalArgumentException("No solution found.");
    }

    public static int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> complement = new HashMap<>();
        for(int i=0; i < nums.length; i++){
            Integer index = complement.get(nums[i]);
            if(index != null){
                return new int[]{index, i};
            }
            complement.put(target - nums[i], i);
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 17;
        int[] result = twoSum(nums, target);

        System.out.println("Indices of the two numbers that add up to the target: " + result[0] + ", " + result[1]);
    }
}

