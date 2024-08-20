package stacks;

import java.util.Stack;

public class ReverseString {

    public static String reverse(String myStr) {
        Stack<Character> stack = new Stack<>();
        char[] chars = myStr.toCharArray();

        for (char c : chars) {
            stack.push(c);
        }

        for (int i = 0; i < myStr.length(); i++) {
            chars[i] = stack.pop();
        }

        return new String(chars);

    }

    public static void main(String[] args) {
        String myStr = "ABCD";
        System.out.println("Before Reverse : " + myStr);
        System.out.println("After Reverse : " + reverse(myStr));
    }
}
