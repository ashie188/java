import java.util.*;

class MergeTreesSolution {

    // TreeNode definition
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Your preorder merge logic (fixed properly)
    public static TreeNode preorder(TreeNode root1, TreeNode root2, TreeNode newtree) {
        if (root1 == null && root2 == null) {
            return null;
        } else if (root1 == null) {
            TreeNode node = new TreeNode(root2.val);
            node.left = preorder(null, root2.left, null);
            node.right = preorder(null, root2.right, null);
            return node;
        } else if (root2 == null) {
            TreeNode node = new TreeNode(root1.val);
            node.left = preorder(root1.left, null, null);
            node.right = preorder(root1.right, null, null);
            return node;
        } else {
            TreeNode node = new TreeNode(root1.val + root2.val);
            node.left = preorder(root1.left, root2.left, null);
            node.right = preorder(root1.right, root2.right, null);
            return node;
        }
    }

    public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return preorder(root1, root2, null);
    }

    // Helper print method to show output (preorder)
    public static void printPreorder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    // MAIN FUNCTION
    public static void main(String[] args) {

        // Create first tree
        /*
                 1
                / \
               3   2
              /
             5
        */
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.right = new TreeNode(2);
        root1.left.left = new TreeNode(5);

        // Create second tree
        /*
                 2
                / \
               1   3
                \   \
                 4   7
        */
        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(3);
        root2.left.right = new TreeNode(4);
        root2.right.right = new TreeNode(7);

        // Merge both trees
        TreeNode merged = mergeTrees(root1, root2);

        // Print preorder output
        System.out.println("Merged Tree Preorder:");
        printPreorder(merged);
    }
}
