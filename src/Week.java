import java.util.Arrays;

public class Week {

    public static int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i = i + 2) {
            res[i + 1] = nums[i];
            res[i] = nums[i + 1];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 3};
//        System.out.println(Arrays.asList(numberGame(arr)));
        for (int num: numberGame(arr))
            System.out.println(num);
    }
}
