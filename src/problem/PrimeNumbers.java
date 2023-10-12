package problem;

public class PrimeNumbers {
    public static void main(String[] args) {
        int lowerRange = 1;
        int upperRange = 100;

        System.out.println("Prime numbers between " + lowerRange + " and " + upperRange + ":");
        for (int num = lowerRange; num <= upperRange; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        for (int num = lowerRange; num <= upperRange; num++) {
            if (isPrime1(num)) {
                System.out.print(num + " ");
            }
        }

        System.out.println();
        for (int num = lowerRange; num <= upperRange; num++) {
            if (isPrime2(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        if (number <= 3) {
            return true;
        }

        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
    public static boolean isPrime1(int number) {
        if (number <= 1) {
            return false;
        }

        if (number <= 3) {
            return true;
        }

        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }

        for (int i = 5; i <= number/2; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPrime2(int num){
        if (num == 1)
            return false;
        if (num == 2 || num == 3)
            return true;
        for (int i = 2; i < num / 2 + 1 ; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}

