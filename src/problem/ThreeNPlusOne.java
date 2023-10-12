package problem;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThreeNPlusOne {
    public static void main(String args[]) {

        int N;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting point for the sequence: ");
        N = sc.nextInt();
        while (N <= 0) {
            System.out.println("The starting point must be positive. Please re-enter the number: ");
            N = sc.nextInt();
        }
        List<Integer> list = getThreeNPlusOneSequence(N);
        System.out.println(list);
        System.out.println();
        System.out.println("There are " + list.size() + " terms in the sequence.");

        ThreeNPlusOne();

    }

    private static void ThreeNPlusOne() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer (n): ");
        int n = scanner.nextInt();
        int count = 0;

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.println("Collatz sequence for " + n + ":");
            while (n != 1) {
                System.out.print(n + " ");
                if (n % 2 == 0) {
                    n = n / 2;
                } else {
                    n = 3 * n + 1;
                }
                count++;
            }
            System.out.println(1); // The sequence ends at 1
        }
        System.out.println(count);
        scanner.close();
    }

    private static List<Integer> getThreeNPlusOneSequence(int N) {
//        int count = 0;
        List<Integer> list = new ArrayList<>();
        while (N != 1) {
            if (N % 2 == 0)
                N = N / 2;
            else
                N = 3 * N + 1;
//            System.out.print(N + "\t");
//            count++;
            list.add(N);
        }
        return list;
    }
}
