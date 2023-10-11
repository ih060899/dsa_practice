package problem;

public class SecondHighestValue {
    public static int findSecondHighest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements.");
            return -1; // Return a suitable default value or throw an exception.
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                secondMax = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("There is no second-highest value.");
            return -1; // Return a suitable default value or throw an exception.
        }

        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = {4, 10, 2, 9, 6};
        int secondHighest = findSecondHighest(arr);

        if (secondHighest != -1) {
            System.out.println("The second-highest value is: " + secondHighest);
        }
    }
}

