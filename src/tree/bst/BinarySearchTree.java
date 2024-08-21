/*
 * Binary Search Tree for Data Structures and Algorithms using JAVA
 */

package tree.bst;

public class BinarySearchTree {

    private TreeNode root;

    private class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }

    }

    // insert the value using root
    public void insert(int value) {
        root = insert(root, value);
    }

    public TreeNode insert(TreeNode root, int value) {
        // base case
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }

        return root;
    }

    // inorder mehtod in bst
    public void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public void inorder() {
        inorder(root);
    }

    // Search the key in bst
    public TreeNode search(int key) {
        return search(root, key);
    }

    public TreeNode search(TreeNode root, int key) {
        if (root == null || root.data == key) {
            return root;
        }

        if (key < root.data) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(6);
        bst.insert(4);
        bst.insert(8);
        bst.insert(2);
        bst.insert(5);
        bst.insert(7);
        bst.insert(9);

        // bst.inorder();
        if (null != bst.search(5)) {
            System.out.println("Key Found!!");
        } else {
            System.out.println("Key not Found!");
        }

    }

}
