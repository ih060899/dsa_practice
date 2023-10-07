package arrays;

public class ArraysMain {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
//        numbers.removeAt(4);
        System.out.println(numbers.max());
        numbers.print();
    }
}
