package problem;
//3. Longest Substring Without Repeating Characters

//Given a string s, find the length of the longest
//        substring
//        without repeating characters.
//
//
//
//        Example 1:
//
//        Input: s = "abcabcbb"
//        Output: 3
//        Explanation: The answer is "abc", with the length of 3.
//        Example 2:
//
//        Input: s = "bbbbb"
//        Output: 1
//        Explanation: The answer is "b", with the length of 1.
//        Example 3:
//
//        Input: s = "pwwkew"
//        Output: 3
//        Explanation: The answer is "wke", with the length of 3.
//        Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
//
//
//        Constraints:
//
//        0 <= s.length <= 5 * 104
//        s consists of English letters, digits, symbols and spaces.

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
//    Initial Setup:
//
//    maxlength = 0, l = 0, r = 0
//    First Iteration (r = 0):
//
//            s.charAt(r) = 'a'
//            s.indexOf('a', 0) = 0 (no repeating character within the window)
//    maxlength = Math.max(0, 0 - 0 + 1) = 1
//    Second Iteration (r = 1):
//
//            s.charAt(r) = 'b'
//            s.indexOf('b', 0) = 1 (no repeating character within the window)
//    maxlength = Math.max(1, 1 - 0 + 1) = 2
//    Third Iteration (r = 2):
//
//            s.charAt(r) = 'c'
//            s.indexOf('c', 0) = 2 (no repeating character within the window)
//    maxlength = Math.max(2, 2 - 0 + 1) = 3
//    Fourth Iteration (r = 3):
//
//            s.charAt(r) = 'a'
//            s.indexOf('a', 0) = 0 (repeating character found)
//    l = 0 + 1 = 1
//    maxlength = Math.max(3, 3 - 1 + 1) = 3
//    Subsequent Iterations:
//
//    Continue adjusting l and updating maxlength as described.
    public static int lengthOfLongestSubstring(String s) {
        int maxlength = 0;
        for (int r = 0, l = 0; r < s.length(); r++) {
            int index = s.indexOf(s.charAt(r), l);
            if (index != r) {
                l = index + 1;
            }
            maxlength = Math.max(maxlength, r - l + 1);
        }
        return maxlength;
    }

    public static int lengthOfLongestSubstring1(String s) {
        int len = s.length(), ans=0;
        Map<Character,Integer> map = new HashMap();
        for(int i=0,j=0;j<len;j++){
            if(map.containsKey(s.charAt(j)))
                i=Math.max(map.get(s.charAt(j)),i);
            ans=Math.max(ans,j-i+1);
            map.put(s.charAt(j),j+1);
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(str.indexOf('c',3 ));
        System.out.println(lengthOfLongestSubstring(str));
//        System.out.println(lengthOfLongestSubstring("bbbbb"));
//        System.out.println(lengthOfLongestSubstring1("pwwkew"));
    }
}
