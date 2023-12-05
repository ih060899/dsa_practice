package problem;

//        8. String to Integer (atoi)
//
//        Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++'s atoi function).
//
//        The algorithm for myAtoi(string s) is as follows:
//
//        Read in and ignore any leading whitespace.
//        Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
//        Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
//        Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
//        If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
//        Return the integer as the final result.
//        Note:
//
//        Only the space character ' ' is considered a whitespace character.
//        Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.
//
//
//        Example 1:
//
//        Input: s = "42"
//        Output: 42
//        Explanation: The underlined characters are what is read in, the caret is the current reader position.
//        Step 1: "42" (no characters read because there is no leading whitespace)
//        ^
//        Step 2: "42" (no characters read because there is neither a '-' nor '+')
//        ^
//        Step 3: "42" ("42" is read in)
//        ^
//        The parsed integer is 42.
//        Since 42 is in the range [-231, 231 - 1], the final result is 42.
//        Example 2:
//
//        Input: s = "   -42"
//        Output: -42
//        Explanation:
//        Step 1: "   -42" (leading whitespace is read and ignored)
//        ^
//        Step 2: "   -42" ('-' is read, so the result should be negative)
//        ^
//        Step 3: "   -42" ("42" is read in)
//        ^
//        The parsed integer is -42.
//        Since -42 is in the range [-231, 231 - 1], the final result is -42.
//        Example 3:
//
//        Input: s = "4193 with words"
//        Output: 4193
//        Explanation:
//        Step 1: "4193 with words" (no characters read because there is no leading whitespace)
//        ^
//        Step 2: "4193 with words" (no characters read because there is neither a '-' nor '+')
//        ^
//        Step 3: "4193 with words" ("4193" is read in; reading stops because the next character is a non-digit)
//        ^
//        The parsed integer is 4193.
//        Since 4193 is in the range [-231, 231 - 1], the final result is 4193.
//
//
//        Constraints:
//
//        0 <= s.length <= 200
//        s consists of English letters (lower-case and upper-case), digits (0-9), ' ', '+', '-', and '.'.

public class StringToIntegerAtoi {

    public static int myAtoi1(String str) {
        int index = 0, sign = 1, total = 0;

        // Remove leading whitespaces
        while (index < str.length() && str.charAt(index) == ' ') {
            index++;
        }

        // Handle signs
        if (index < str.length() && (str.charAt(index) == '+' || str.charAt(index) == '-')) {
            sign = str.charAt(index++) == '+' ? 1 : -1;
        }

        // Convert characters to integers
        while (index < str.length()) {
            int digit = str.charAt(index++) - '0';

            // Break if character is not a digit
            if (digit < 0 || digit > 9) {
                break;
            }

            // Check for overflow before updating total
            if (Integer.MAX_VALUE / 10 < total || (Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < digit)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            total = total * 10 + digit;
        }

        return total * sign;
    }

    public static int myAtoi(String str) {
        char min = '0';
        char max = '9';
        long out = 0;
        boolean numbersOnly = false;
        boolean sign = false;
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if (!numbersOnly) {
                // Step 1
                if (x == ' ')
                    continue;

                if (x == '+') {
                    sign = true;
                    numbersOnly = true;
                } else if (x == '-') {
                    sign = false;
                    numbersOnly = true;
                } else if (x >= min && x <= max) {
                    sign = true;
                    numbersOnly = true;
                    i--;
                } else
                    return 0;
            } else {
                if (x < min || x > max)
                    break;
                else {
                    int num = x - '0';
//                    if (x == 0)
//                        continue;
                    out = (out * 10) + num;
//                    out += num;
                    if (out > Integer.MAX_VALUE)
                        break;
                }

            }
        }
        // Step 2
        if (!sign) out *= -1;
        // Step 3
        if (out > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;

        if (out < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        return (int) out;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("42"));
        System.out.println(myAtoi("   -42"));
        System.out.println(myAtoi("4193 with words"));
    }
}
