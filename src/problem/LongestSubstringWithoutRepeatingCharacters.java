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
//        System.out.println(lengthOfLongestSubstring(str));
//        System.out.println(lengthOfLongestSubstring("bbbbb"));
//        System.out.println(lengthOfLongestSubstring1("pwwkew"));
    }
}
