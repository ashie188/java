public class FlattenBinaryTree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    static TreeNode prev = null;

    public static void flatten(TreeNode root) {

        if (root == null) {
            return;
        }

        // Save the original children
        TreeNode left = root.left;
        TreeNode right = root.right;

        // Connect previous node to current node
        if (prev != null) {
            prev.left = null;
            prev.right = root;
        }

        prev = root;

        // Preorder: Root -> Left -> Right
        flatten(left);
        flatten(right);
    }

    // Print the flattened tree
    static void printFlattenedTree(TreeNode root) {

        while (root != null) {
            System.out.print(root.val + " -> ");
            root = root.right;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        /*
                 1
                / \
               2   5
              / \   \
             3   4   6
        */

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(5);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right.right = new TreeNode(6);

        // Flatten the tree
        flatten(root);

        // Print result
        printFlattenedTree(root);
    }
}