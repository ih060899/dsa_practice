package binary_tree;

public class RecursionMain {
    public static void main(String[] args) {
        System.out.println(factorialRec(4));
    }

    public static int factorial(int n){
        int factorial = 1;
        for (int i = n; i > 1; i--) {
            factorial *= i;
        }
        return factorial;
    }

    public static int factorialRec(int n){
        // Base condition
        if (n == 0){
            return 1;
        }
        return n * factorialRec(n-1);
    }
}
