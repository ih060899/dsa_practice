import java.util.Arrays;
import java.util.Map;

public class DemoMain {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 1, -4};
        int[] arr1 = {0, 0, 0};
        System.out.println(threeSumClosest(arr, 1));
        System.out.println(threeSumClosest(arr1, 1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++){
            int left = i + 1, right = nums.length - 1;
            while (left < right){
                int currentSum = nums[i] + nums[left] + nums[right];
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target))
                    closestSum = currentSum;
                if (currentSum < target){
                    left++;
                }else {
                    right--;
                }
            }
        }
        return closestSum;
    }
}
