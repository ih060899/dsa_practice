package problem;

import java.util.Arrays;
import java.util.List;

public class FindCommonElementsBetweenTwoArrays {

    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {

        int[] result = new int[2];
        int temp = 0;
        for(int i=0; i < nums1.length; i++){
            if(result[1] >0)
                break;
            for(int j= 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){

                    result[temp++] = nums1[i];
                    break;
                }
            }
        }
        Arrays.sort(result);
        return result;
    }


    public static int removeAlmostEqualCharacters(String s) {
        int i = 0, n = s.length();
        char[] res = s.toCharArray();
        for (int j = 0; j < n; ++j, ++i) {
            res[i] = res[j];
            if (i > 0 && res[i - 1] == res[i]) // count = 2
                i -= 2;
        }
        return new String(res, 0, i).length();
    }
    public static void main(String[] args) {
        int[] nums1 = {4, 3, 2, 3, 1};
        int[] nums2 = {2, 2, 5, 2, 3, 6};
        int[] intersectionValues = findIntersectionValues(nums1, nums2);
        String str = "djkhed";
        int len = str.length();
        System.out.println(removeAlmostEqualCharacters("aaaaa"));
//        for (int v: intersectionValues)
//            System.out.println(v);
    }
}
