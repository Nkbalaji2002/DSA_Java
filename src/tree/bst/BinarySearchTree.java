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

    public boolean isValid(int min, int max) {
        return isValid(root, min, max);
    }

    // validate the bst
    public boolean isValid(TreeNode root, int min, int max) {
        if (root == null) {
            return true;
        }

        if (root.data <= min || root.data >= max) {
            return false;
        }

        boolean left = isValid(root.left, min, root.data);

        if (left) {
            boolean right = isValid(root.right, root.data, max);
            return right;
        }

        return false;
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(2);
        bst.insert(6);
        bst.insert(1);
        bst.insert(3);

        // bst.inorder();
        // if (null != bst.search(5)) {
        // System.out.println("Key Found!!");
        // } else {
        // System.out.println("Key not Found!");
        // }

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        if (bst.isValid(min, max)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

}
