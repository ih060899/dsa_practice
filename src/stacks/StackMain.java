package stacks;

public class StackMain {
    public static void main(String[] args) {
//        System.out.println(StringReverser.reverse("technonext"));
//        System.out.println(Expression.isBalanced("[(1 + 2)<>]"));

        Stack stack = new Stack();
//        stack.pop();
        stack.push(10);
        stack.push(20);
        stack.push(30);
//        stack.pop();
//        stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack);
    }
}
