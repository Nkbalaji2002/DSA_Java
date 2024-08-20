package stacks.list;

import java.util.NoSuchElementException;

public class Stack {
    private ListNode top;
    private int length;

    public Stack() {
        top = null;
        length = 0;
    }

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    // push method
    public void push(int data) {
        ListNode temp = new ListNode(data);

        temp.next = top;
        top = temp;
        length++;
    }

    // pop method
    public int pop() {
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

    // peek method
    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        return top.data;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);

        System.out.println("top : " + stack.peek());

        stack.pop();
        System.out.println("top : " + stack.peek());

    }

}
