package linkedlists;

import java.util.NoSuchElementException;

public class CircularLinkedList {
    private ListNode last;
    private int length;

    public CircularLinkedList() {
        last = null;
        length = 0;
    }

    private class ListNode {
        private ListNode next;
        private int data;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void createCirularLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth;
    }

    public void display() {
        if (last == null) {
            return;
        }

        ListNode first = last.next;

        while (first != last) {
            System.out.print(first.data + " ");
            first = first.next;
        }

        System.out.print(first.data + "\n");
    }

    public void insertFirst(int data) {
        ListNode temp = new ListNode(data);

        if (last == null) {
            last = temp;
        } else {
            temp.next = last.next;
        }

        last.next = temp;
        length++;
    }

    public void insertLast(int value) {
        ListNode temp = new ListNode(value);

        if (last == null) {
            last = temp;
            last.next = last;
        } else {
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }

        length++;
    }

    public ListNode deleteFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        ListNode temp = last.next;

        if (last.next == last) {
            last = null;
        } else {
            last.next = temp.next;
        }

        temp.next = null;
        length--;
        return temp;
    }

    // main method
    public static void main(String[] args) {
        CircularLinkedList myCircularLinkedList = new CircularLinkedList();
        // myCircularLinkedList.createCirularLinkedList();

        myCircularLinkedList.insertLast(1);
        myCircularLinkedList.insertLast(2);
        myCircularLinkedList.insertLast(3);
        myCircularLinkedList.insertLast(4);

        myCircularLinkedList.display();

        myCircularLinkedList.deleteFirst();
        myCircularLinkedList.deleteFirst();
        myCircularLinkedList.deleteFirst();

        myCircularLinkedList.display();

    }
}
