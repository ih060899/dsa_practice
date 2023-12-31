package problem;

//11. Container With Most Water
//        You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
//
//        Find two lines that together with the x-axis form a container, such that the container contains the most water.
//
//        Return the maximum amount of water a container can store.
//
//        Notice that you may not slant the container.
//Example 1:
//Input: height = [1,8,6,2,5,4,8,3,7]
//        Output: 49
//        Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
//        Example 2:
//
//        Input: height = [1,1]
//        Output: 1
//
//
//        Constraints:
//
//        n == height.length
//        2 <= n <= 105
//        0 <= height[i] <= 104

import java.util.HashMap;
import java.util.Map;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int l = 0, r = height.length - 1;
        while (l < r) {
            max = Math.max(max, (r - l) * Math.min(height[r], height[l]));
            if (height[l] <= height[r]) {
                int hl = height[l];
                while (l < r && height[l] <= hl)
                    l++;
            } else {
                int hr = height[r];
                while (l < r && height[r] <= hr)
                    r--;
            }
        }
        return max;

    }

    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        // map.get(s.charAt(i) > map.get(s.charAt(i - 1)
        int r = 0;
        for(int i = 0; i<s.length();i++){
            if(i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) {
                r += (map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1)));
            }
            else{
                r += map.get(s.charAt(i));
            }

        }
        return r;
    }

    public static void main(String[] args) {
        int[] array = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(array));
    }
}
