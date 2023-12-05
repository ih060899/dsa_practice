package problem;


//7. Reverse Integer
//        Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
//
//        Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
//
//
//
//        Example 1:
//
//        Input: x = 123
//        Output: 321
//        Example 2:
//
//        Input: x = -123
//        Output: -321
//        Example 3:
//
//        Input: x = 120
//        Output: 21
//
//
//        Constraints:
//
//        -231 <= x <= 231 - 1
public class ReverseInteger {
    public static int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10)
                return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public static int reverse1(int x) {
        long finalNum = 0;
        while(x!=0){
            int lastDig = x%10;
            finalNum = finalNum*10 + lastDig;
            x= x/10;
        }
        if(finalNum > Integer.MAX_VALUE || finalNum  < Integer.MIN_VALUE){
            return 0;
        }
        return (int) finalNum;
    }

    public static void main(String[] args) {
        System.out.println(reverse1(123));
        System.out.println(reverse1(-123));
        System.out.println(reverse1(120));
        System.out.println(reverse1(1534236469));
        System.out.println(reverse1(-2147483412));
//        System.out.println(Integer.MAX_VALUE/10);
    }
}
