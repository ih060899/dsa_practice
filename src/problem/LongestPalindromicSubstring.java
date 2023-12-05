package problem;

//        5. Longest Palindromic Substring
//        Given a string s, return the longest
//        palindromic
//
//        substring
//        in s.
//
//
//
//        Example 1:
//
//        Input: s = "babad"
//        Output: "bab"
//        Explanation: "aba" is also a valid answer.
//        Example 2:
//
//        Input: s = "cbbd"
//        Output: "bb"
//
//
//        Constraints:
//
//        1 <= s.length <= 1000
//        s consist of only digits and English letters.

public class LongestPalindromicSubstring {
    private static int lo, maxLen;

    private static void extendPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        if (maxLen < k - j - 1) {
            lo = j + 1;
            maxLen = k - j - 1;
        }
    }
    public static String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2)
            return s;

        for (int i = 0; i < len - 1; i++) {
            extendPalindrome(s, i, i);  //assume odd length, try to extend Palindrome as possible
            extendPalindrome(s, i, i + 1); //assume even length.
        }
        return s.substring(lo, lo + maxLen);
    }


    public static void expandPalindrome(char[] s, int j, int k) {
        while (j >= 0 && k < s.length && s[j] == s[k]) {
            j--;
            k++;
        }
        if (maxLen < k - j - 1) {
            maxLen = k - j - 1;
            lo = j + 1;
        }
    }

    public static String longestPalindrome1(String s) {
        char[] input = s.toCharArray();
        if (s.length() < 2) {
            return s;
        }

        for (int i = 0; i < input.length; i++) {
            expandPalindrome(input, i, i); //assume odd length, try to extend Palindrome as possible
            expandPalindrome(input, i, i + 1); //assume even length.
        }
        return s.substring(lo, lo + maxLen);
    }

    public static boolean palindrome(String str){
        char[] input = str.toCharArray();
        int startIndex = 0;
        int endIndex = input.length - 1;
        while (startIndex < endIndex){
            if (input[startIndex] != input[endIndex])
                return false;
            startIndex++;
            endIndex--;
        }
        return true;
    }

    public static void main(String[] args) {
//        System.out.println(longestPalindrome1("babad"));
//        System.out.println(longestPalindrome1("cbbd"));
        System.out.println(palindrome("abcba"));

    }
}
