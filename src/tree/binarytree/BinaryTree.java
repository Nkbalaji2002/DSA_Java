/* 
 * Binary Tree for Data Structure and Algorithms
 */

package tree.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {

    private static TreeNode root;

    private class TreeNode {
        private int data;
        private TreeNode right;
        private TreeNode left;

        public TreeNode(int data) {
            this.data = data;
        }

    }

    public void preOrder(TreeNode root) {
        // base case
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void preOrder() {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");

            if (temp.right != null) {
                stack.push(temp.right);
            }

            if (temp.left != null) {
                stack.push(temp.left);
            }
        }

    }

    public void inOrder(TreeNode root) {
        // Base Case
        if (root == null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public void inOrder() {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;

        while (!stack.isEmpty() || temp != null) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    // Recursive PostOrder Traversal
    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    // Iterative PostOrder Traversal
    public void postOrder() {
        TreeNode current = root;
        Stack<TreeNode> stack = new Stack<>();

        while (current != null || !stack.isEmpty()) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                TreeNode temp = stack.peek().right;

                if (temp == null) {
                    temp = stack.pop();
                    System.out.print(temp.data + " ");

                    while (!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.pop();
                        System.out.print(temp.data + " ");
                    }
                } else {
                    current = temp;
                }
            }
        }
    }

    // Level Order Traversal of Binary Tree
    public void levelOrder() {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print(temp.data + " ");

            if (temp.left != null) {
                queue.offer(temp.left);
            }

            if (temp.right != null) {
                queue.offer(temp.right);
            }
        }

    }

    // Find the Maximum Value in Binary Tree
    public int findMax(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        int result = root.data;
        int left = findMax(root.left);
        int right = findMax(root.right);

        if (left > result) {
            result = left;
        }

        if (right > result) {
            result = right;
        }

        return result;
    }

    public void createBinaryTree() {
        TreeNode first = new TreeNode(4);
        TreeNode second = new TreeNode(3);
        TreeNode third = new TreeNode(7);
        TreeNode fourth = new TreeNode(6);
        TreeNode fifth = new TreeNode(8);

        root = first;

        first.left = second;
        first.right = third;

        second.left = fourth;
        second.right = fifth;
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        bt.createBinaryTree();

        int result = bt.findMax(root);
        System.out.println("result of Maxmimum value is " + result);
    }

}
