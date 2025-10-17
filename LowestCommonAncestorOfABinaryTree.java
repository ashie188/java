// LeetCode 236 – Lowest Common Ancestor of a Binary Tree

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class LowestCommonAncestorOfABinaryTree {

    // Global variable to store the answer
    static TreeNode ans = null;

    // Main LCA function
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        helper(root, p, q);
        return ans;
    }

    // Helper recursive function
    private static boolean helper(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return false;

        // Search in left and right subtrees
        boolean left = helper(root.left, p, q);
        boolean right = helper(root.right, p, q);

        // Check if current node is p or q
        boolean mid = (root == p || root == q);

        // If any two of these three are true → current node is LCA
        if ((mid && left) || (mid && right) || (left && right)) {
            ans = root;
        }

        // Return true if p or q found in this subtree
        return (mid || left || right);
    }

    // Main function to test
    public static void main(String[] args) {
        /*
                   3
                  / \
                 5   1
                / \ / \
               6  2 0  8
                 / \
                7   4
        */

        // Build the tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        // Choose two nodes (p and q)
        TreeNode p = root.left;          // node 5
        TreeNode q = root.right;         // node 1

        // Find LCA
        TreeNode lca = lowestCommonAncestor(root, p, q);

        System.out.println("Lowest Common Ancestor of " + p.val + " and " + q.val + " is: " + lca.val);
    }
}
