package problem;

//1716. Calculate Money in Leetcode Bank
//
//        Hercy wants to save money for his first car. He puts money in the Leetcode bank every day.
//
//        He starts by putting in $1 on Monday, the first day. Every day from Tuesday to Sunday, he will put in $1 more than the day before. On every subsequent Monday, he will put in $1 more than the previous Monday.
//        Given n, return the total amount of money he will have in the Leetcode bank at the end of the nth day.
//
//
//
//        Example 1:
//
//        Input: n = 4
//        Output: 10
//        Explanation: After the 4th day, the total is 1 + 2 + 3 + 4 = 10.
//        Example 2:
//
//        Input: n = 10
//        Output: 37
//        Explanation: After the 10th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4) = 37. Notice that on the 2nd Monday, Hercy only puts in $2.
//        Example 3:
//
//        Input: n = 20
//        Output: 96
//        Explanation: After the 20th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4 + 5 + 6 + 7 + 8) + (3 + 4 + 5 + 6 + 7 + 8) = 96.
//
//
//        Constraints:
//
//        1 <= n <= 1000

public class CalculateMoneyInLeetcodeBank {

    public static int totalMoney(int n) {
        int week_count = n / 7;
        int remaining_days = n % 7;

        // Contribution from complete weeks
        int total = ((week_count * (week_count - 1)) / 2) * 7;
        // Contribution from complete weeks (additional on Mondays)
        total += week_count * 28;
        // Contribution from remaining days
        total += ((remaining_days * (remaining_days + 1)) / 2) + (week_count * remaining_days);

//        return total;
        return (((week_count * (week_count - 1)) / 2) * 7) +
                (week_count * 28) +
                (((remaining_days * (remaining_days + 1)) / 2) + (week_count * remaining_days));
    }

    public static int totalMoney1(int n) {
        int numberOfWeeks = n/7;
        int remainingDays = n%7;
        int start = 1;
        int sum = 0;
        for(int i=0; i<numberOfWeeks; i++) {
            // 7 days a week. If start = 1, then end should be 1 + 6 = 7
            // similarly in next case when start = 2, end = 2+6 = 8
            int end = start+6;
            // Gauss Theorem. From start to end there's 7 numbers
            int tmp = ((start+end)*7)/2;
            sum += tmp;
            // increase for next week
            start++;
        }
        // if there's any remaining days
        for(int i=0; i<remainingDays; i++) {
            sum+=start++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(totalMoney(14));
        System.out.println(totalMoney(10));
        System.out.println(totalMoney1(26));
    }
}
