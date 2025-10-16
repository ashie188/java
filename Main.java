
import java.util.*;

// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Main {

    public static List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        HashSet<Integer> set = new HashSet<>();
        for (int val : to_delete) set.add(val);

        List<TreeNode> result = new ArrayList<>();
        root = helper(root, set, result);

        // If root wasn't deleted, it's part of the forest
        if (root != null) result.add(root);

        return result;
    }

    private static TreeNode helper(TreeNode node, HashSet<Integer> set, List<TreeNode> result) {
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

    public static void main(String[] args) {
        // Example: [1,2,3,4,5,6,7], to_delete = [3,5]
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        int[] to_delete = {3, 5};

        List<TreeNode> forest = delNodes(root, to_delete);

        System.out.println("Roots of new forest:");
        for (TreeNode node : forest) {
            System.out.print(node.val + " ");
        }
    }
}
