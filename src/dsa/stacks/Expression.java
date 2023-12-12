package dsa.stacks;

import java.util.List;
import java.util.Stack;

public class Expression {

    private static final List<Character> rightBrackets = List.of(')', '>', ']', '}');
    private static final List<Character> leftBrackets = List.of('(', '<', '[', '}');

    public static boolean isBalanced(String input) {
        if (input == null) {
            throw new IllegalArgumentException();
        }
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            if (isLeftBracket(ch)) {
                stack.push(ch);
            }
            if (isRightBracket(ch)) {
                if (stack.empty()) return false;

                var top = stack.pop();
                if (!bracketsMatch(ch, top)) return false;
            }
        }
        return stack.empty();
    }

    private static boolean bracketsMatch(char left, char right) {

        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);

//        return (left == ')' && right != '(') ||
//                (left == '>' && right != '<') ||
//                (left == ']' && right != '[') ||
//                (left == '}' && right != '{');
    }

    private static boolean isRightBracket(char ch) {
//        List<Character> rightBrackets = Arrays.asList(')', '>', ']', '}');
//        return ch == ')' || ch == '>' || ch == ']' || ch == '}';
        return rightBrackets.contains(ch);
    }

    private static boolean isLeftBracket(char ch) {
//        List<Character> leftBrackets = Arrays.asList('(', '<', '[', '}');
//        return ch == '(' || ch == '<' || ch == '[' || ch == '{';
        return leftBrackets.contains(ch);
    }
}
