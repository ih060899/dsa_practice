package problem;

public class Factorial {
    public static void main(String[] args) {
        int n = 5; // Change this to the number for which you want to calculate the factorial

        factorial(n);

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = calculateFactorial(n);
            System.out.println("Factorial of " + n + " is " + factorial);
        }
    }

    private static void factorial(int n) {
        long factorial = 1;

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            System.out.println("Factorial of " + n + " is " + factorial);
        }
    }

    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}

