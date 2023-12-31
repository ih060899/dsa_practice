package problem;

// 1624. Largest Substring Between Two Equal Characters

//Given a string s, return the length of the longest substring between two equal characters, excluding the two characters. If there is no such substring return -1.
//
//A substring is a contiguous sequence of characters within a string.
//
//
//
//        Example 1:
//
//Input: s = "aa"
//Output: 0
//Explanation: The optimal substring here is an empty substring between the two 'a's.
//        Example 2:
//
//Input: s = "abca"
//Output: 2
//Explanation: The optimal substring here is "bc".
//Example 3:
//
//Input: s = "cbzxy"
//Output: -1
//Explanation: There are no characters that appear twice in s.
//
//
//        Constraints:
//
//        1 <= s.length <= 300
//s contains only lowercase English letters.

import java.util.Arrays;

public class LargestSubstringBetweenTwoEqualCharacters {
    public static int maxLengthBetweenEqualCharacters1(String s) {
        int[] map = new int[26];
        Arrays.fill(map, -1);
        int ans = -1;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(map[c-'a'] == -1){
                map[c-'a'] = i;
            } else {
                ans = Math.max(ans, i-map[c-'a']-1);
            }
        }
        return ans;
    }

    public static int maxLengthBetweenEqualCharacters(String s) {
        int result = -1;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)){
                    result = Math.max(result, j - i - 1);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(maxLengthBetweenEqualCharacters1("aa"));
        System.out.println(maxLengthBetweenEqualCharacters1("abca"));
        System.out.println(maxLengthBetweenEqualCharacters1("cbzxy"));
    }
}
