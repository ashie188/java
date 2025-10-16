/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution1 {

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        HashSet<Integer> set = new HashSet<>();
        for (int val : to_delete) set.add(val);

        List<TreeNode> result = new ArrayList<>();
        root = helper(root, set, result);

        // If root wasn't deleted, it's part of the forest
        if (root != null) result.add(root);

        return result;
    }

    private TreeNode helper(TreeNode node, HashSet<Integer> set, List<TreeNode> result) {
        if (node == null) return null;

        node.left = helper(node.left, set, result);
        node.right = helper(node.right, set, result);

        // If node needs to be deleted
        if (set.contains(node.val)) {
            if (node.left != null) result.add(node.left);
            if (node.right != null) result.add(node.right);
            return null; // delete this node
        }

        return node;
    }
}
