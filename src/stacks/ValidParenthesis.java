package stacks;

import java.util.Stack;

public class ValidParenthesis {

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.peek();
                    if ((top == '{' && c == '}') ||
                            (top == '[' && c == ']') ||
                            (top == '(' && c == ')')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();

    }

    public static void main(String[] args) {
        String str = "{()}";

        str = "[{}";

        System.out.println(isValid(str));
    }
}
