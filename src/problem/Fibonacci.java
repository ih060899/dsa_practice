package problem;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Change this to the number of Fibonacci numbers you want to generate
        fibonacci(n);
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursion(i) + " ");
        }
    }

    private static void fibonacci(int n) {
        int first = 0, second = 1;

        System.out.println("Fibonacci Series (Up to " + n + " terms):");

        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static int fibonacciRecursion(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }
}
