package linkedlists;

public class SinglyLinkedList {
    private ListNode head;

    // print elements of the singly linked list
    public void display() {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }

        System.out.print("null \n");
    }

    // find the length of singly linked list
    public int findLength() {
        int count = 0;
        ListNode current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    // Insert node at beginning of a singly linked list
    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);

        newNode.next = head;
        head = newNode;
    }

    // Insert node at end of a singly linked list
    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);

        if (head == null) {
            head = newNode;
            return;
        }

        ListNode current = head;

        while (null != current.next) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Insert a node in Singly Linked List an given position
    public void insert(int position, int value) {
        ListNode node = new ListNode(value);

        if (position == 1) {
            node.next = head;
            head = node;
        }

        else {
            ListNode previous = head;
            int count = 1;

            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            node.next = current;
            previous.next = node;
        }
    }

    // Delete the first node of singly linked list
    public ListNode deleteFirst() {
        if (head == null) {
            return null;
        }

        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    // Delete the last node of singly linked list
    public ListNode deleteLast() {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        ListNode previous = null;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }

        previous.next = null;
        return current;
    }

    // Delete a node from single linked list at given position
    public void delete(int position) {

        if (position == 1) {
            head = head.next;
        }

        else {
            ListNode previous = head;
            int count = 1;

            while (count < position - 1) {
                previous = previous.next;
                count++;
            }

            ListNode current = previous.next;
            previous.next = current.next;
        }

    }

    // how to search an element in singly linked list
    public boolean findSearch(ListNode head, int searchKey) {
        if (head == null) {
            return false;
        }

        ListNode current = head;

        while (current != null) {
            if (current.data == searchKey) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    // How to Reverse Singly Linked List
    public ListNode reverseList(ListNode head) {

        if (head == null) {
            return head;
        }

        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }

    // How to find middle node in singly linked list
    public ListNode getMiddleNode() {
        if (head == null) {
            return null;
        }

        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        return slowPtr;
    }

    // How to find nth node From the end in Singly Linked List
    public ListNode getnthNode(int n) {
        ListNode mainPtr = head;
        ListNode refPtr = head;
        int count = 0;

        while (count < n) {
            refPtr = refPtr.next;
            count++;
        }

        while (refPtr != null) {
            refPtr = refPtr.next;
            mainPtr = mainPtr.next;
        }

        return mainPtr;
    }

    // How to Remove Duplicates from Singly Liuked List
    public void removeDuplicate() {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    // How to insert a node in sorted singly linked list
    public ListNode InsertInSortedList(int value) {
        ListNode newNode = new ListNode(value);

        if (head == null) {
            return newNode;
        }

        ListNode current = head;
        ListNode temp = null;

        while (current != null && current.data < newNode.data) {
            temp = current;
            current = current.next;
        }

        newNode.next = current;
        temp.next = newNode;
        return head;
    }

    // Remove a given key from singly linked list
    public void deleteNode(int key) {
        ListNode current = head;
        ListNode temp = null;

        while (current != null && current.data != key) {
            temp = current;
            current = current.next;
        }

        if (current == null) {
            return;
        }

        temp.next = current.next;
    }

    // detect the loop in linked list
    public ListNode containsLoop() {
        ListNode fastPtr = head;
        ListNode slowPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

            if (slowPtr == fastPtr) {
                removeLoop(slowPtr);
                return head;
                // return getStartingNode(slowPtr);
                // return true;
            }
        }
        return null;

        // return null;
        // return false;
    }

    // Find the start of loop in singly linked list
    public ListNode getStartingNode(ListNode slowPtr) {
        ListNode temp = head;

        while (slowPtr != temp) {
            temp = temp.next;
            slowPtr = slowPtr.next;
        }

        return temp;
    }

    // Remove the loop from singly linked list
    public void removeLoop(ListNode slowPtr) {
        ListNode temp = head;

        while (slowPtr.next != temp.next) {
            temp = temp.next;
            slowPtr = slowPtr.next;
        }

        slowPtr.next = null;
    }

    // create the loop in singly Linked List
    public void createLoopinLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);

        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;
    }

    // Merge the two sorted linked list
    public static ListNode Merge(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

        if (a == null) {
            tail.next = b;
        } else {
            tail.next = a;
        }

        return dummy.next;
    }

    // Add Two Singly Linked List
    public static ListNode AddTwoSinglyList(ListNode a, ListNode b) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        int carry = 0;

        while (a != null || b != null) {
            int x = (a != null) ? a.data : 0;
            int y = (b != null) ? b.data : 0;
            int sum = carry + x + y;
            carry = sum / 10;

            tail.next = new ListNode(sum % 10);
            tail = tail.next;

            if (a != null) {
                a = a.next;
            }

            if (b != null) {
                b = b.next;
            }
        }

        if (carry > 0) {
            tail.next = new ListNode(carry);
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        SinglyLinkedList myLinkedList = new SinglyLinkedList();
        SinglyLinkedList myLinkedList2 = new SinglyLinkedList();

        // how to create singly linked list
        // head = new ListNode(10);

        // ListNode second = new ListNode(1);
        // ListNode third = new ListNode(8);
        // ListNode fourth = new ListNode(11);

        // head.next = second;
        // second.next = third;
        // third.next = fourth;

        // result.display();
        // System.out.println(result.findLength());

        // myLinkedList.insertLast(10);
        // myLinkedList.insertLast(8);
        // myLinkedList.insertLast(1);
        // myLinkedList.insertLast(11);
        // myLinkedList.insertLast(15);

        // myLinkedList.display(head); // 10 --> 1 --> 8 --> 11 --> null

        // first position insert the node
        // myLinkedList.insert(1, 4); // 4 --> 10 --> 1 --> 8 --> 11 --> null
        // myLinkedList.display();

        // // middle position insert the node
        // myLinkedList.insert(3, 20); // 4 --> 10 --> 20 --> 1 --> 8 --> 11 --> null
        // myLinkedList.display();

        // // last position insert the node
        // myLinkedList.insert(7, 25); // 4 --> 10 --> 20 --> 1 --> 8 --> 11 --> 25 -->
        // null
        // myLinkedList.display();

        // myLinkedList.insertFirst(7);
        // myLinkedList.insertLast(7);
        // myLinkedList.display();

        // delete the first position node
        // System.out.println(myLinkedList.deleteFirst().data);
        // System.out.println(myLinkedList.deleteFirst().data);
        // System.out.println(myLinkedList.deleteFirst().data);

        // delete the last position node
        // System.out.println(myLinkedList.deleteLast().data);
        // System.out.println(myLinkedList.deleteLast().data);
        // System.out.println(myLinkedList.deleteLast().data);
        // System.out.println(myLinkedList.deleteLast().data);

        // delete the node given position
        // myLinkedList.delete(3);
        // myLinkedList.display();

        // myLinkedList.delete(3);
        // myLinkedList.display();

        // find the element
        // String result = myLinkedList.findSearch(head, 1) ? "Search Key found" :
        // "Search Key not found";
        // result = myLinkedList.findSearch(head, 21) ? "Search Key found" : "Search Key
        // not found";
        // System.out.println(result);

        // reverse the singly linked list
        // ListNode rev_result = myLinkedList.reverseList(head);
        // myLinkedList.display(rev_result);

        // find the middle node
        // ListNode result = myLinkedList.getMiddleNode();
        // System.out.println("Middle Node : " + result.data);

        // Find the n-th node from the end
        // int n = 2;
        // ListNode result = myLinkedList.getnthNode(2);
        // System.out.println(n + "-th node : " + result.data);

        // Remove Duplicates in Linked List
        // myLinkedList.insertLast(1);
        // myLinkedList.insertLast(1);
        // myLinkedList.insertLast(2);
        // myLinkedList.insertLast(3);
        // myLinkedList.insertLast(3);
        // myLinkedList.display(head);
        // myLinkedList.removeDuplicate();

        // Insert a node in sorted singly linked list
        // myLinkedList.insertLast(1);
        // myLinkedList.insertLast(8);
        // myLinkedList.insertLast(10);
        // myLinkedList.insertLast(16);
        // myLinkedList.display(head);

        // myLinkedList.InsertInSortedList(13);

        // // Remove a given key from singly linked list
        // myLinkedList.deleteNode(10);

        // detect the loop in singly linked list
        // myLinkedList.createLoopinLinkedList();
        // System.out.println(myLinkedList.containsLoop());

        // find the start of loop in singly linked list
        // System.out.println(myLinkedList.containsLoop().data);

        // remove the loop from singly linked list
        // myLinkedList.containsLoop();
        // myLinkedList.display(head);

        // merge the sorted lined list
        myLinkedList.insertLast(7);
        myLinkedList.insertLast(4);
        myLinkedList.insertLast(9);

        myLinkedList2.insertLast(5);
        myLinkedList2.insertLast(6);

        SinglyLinkedList result = new SinglyLinkedList();
        // result.head = Merge(myLinkedList.head, myLinkedList2.head);
        result.head = AddTwoSinglyList(myLinkedList.head, myLinkedList2.head);

        result.display();

    }
}
