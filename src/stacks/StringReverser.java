package stacks;

import java.util.Stack;

public class StringReverser {
    public static String reverse(String input){
        if (input == null){
            throw new IllegalArgumentException();
        }

        Stack<Character> stack = new Stack<>();
//        for (int i = 0; i < input.length(); i++) {
//            stack.push(input.charAt(i));
//        }

        for (char ch: input.toCharArray()) {
            stack.push(ch);
        }

        StringBuilder reverse = new StringBuilder();

        while (!stack.empty()){
            reverse.append(stack.pop());
        }
        return reverse.toString();
    }
}
