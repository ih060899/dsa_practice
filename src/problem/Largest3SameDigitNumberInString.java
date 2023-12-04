package problem;


//        2264. Largest 3-Same-Digit Number in String
//
//        You are given a string num representing a large integer. An integer is good if it meets the following conditions:
//
//        It is a substring of num with length 3.
//        It consists of only one unique digit.
//        Return the maximum good integer as a string or an empty string "" if no such integer exists.
//
//        Note:
//
//        A substring is a contiguous sequence of characters within a string.
//        There may be leading zeroes in num or a good integer.
//
//
//        Example 1:
//
//        Input: num = "6777133339"
//        Output: "777"
//        Explanation: There are two distinct good integers: "777" and "333".
//        "777" is the largest, so we return "777".
//        Example 2:
//
//        Input: num = "2300019"
//        Output: "000"
//        Explanation: "000" is the only good integer.
//        Example 3:
//
//        Input: num = "42352338"
//        Output: ""
//        Explanation: No substring of length 3 consists of only one unique digit. Therefore, there are no good integers.
//
//
//        Constraints:
//
//        3 <= num.length <= 1000
//        num only consists of digits.

public class Largest3SameDigitNumberInString {
    public static String largestGoodInteger(String num)
    {
        // largest to smallest good integers
        String [] goodIntegers={"999", "888", "777", "666", "555", "444", "333", "222", "111", "000"};
        // check if anyone present
        for(String goodInteger:goodIntegers){

            if(num.contains(goodInteger)){
                return goodInteger;
            }
        }
        //no good integers present
        return "";
    }


    public static String largestGoodInteger1(String num) {
        int ans=-1;
        for(int i=0;i+2<num.length();i++){
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i)==num.charAt(i+2))
                ans= Math.max(ans,num.charAt(i)-'0');
        }
        StringBuilder sb = new StringBuilder(3);
        for(int i=0;i<3;i++) sb.append((char)(48+ans));
        return ans!=-1? sb.toString() : "";
    }

    public static void main(String[] args) {
        System.out.println(largestGoodInteger("6777133339"));
        System.out.println(largestGoodInteger1("2300019"));
        System.out.println(largestGoodInteger("42352338"));

    }
}
