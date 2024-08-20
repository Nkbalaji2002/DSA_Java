package tree.binarytree;

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

    public void createBinaryTree() {
        TreeNode first = new TreeNode(9);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);

        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;

    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
        bt.preOrder(root);

        System.out.println();
    }

}
