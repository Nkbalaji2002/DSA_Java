/* 
 * Binary Tree for Data Structure and Algorithms
 */

package tree.binarytree;

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

    public void createBinaryTree() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);

        root = first;

        first.left = second;
        first.right = third;

        second.left = fourth;

        // first.left = second;
        // first.right = third;

        // second.left = fourth;
        // second.right = fifth;

        // third.left = sixth;
        // third.right = seventh;
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();

        bt.postOrder(root);
        // bt.preOrder(root);
        // bt.preOrder();

        // bt.inOrder(root);
        // bt.inOrder();

        System.out.println();
    }

}
