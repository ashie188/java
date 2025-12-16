import java.util.*;

public class PathSumII_Demo {

    // TreeNode definition
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {}

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // Same logic, different class
    public static void preorder(TreeNode root, int targetSum,
                                List<List<Integer>> biggerlist,
                                List<Integer> list,
                                int currsum) {

        if (root == null) {
            return;
        }

        list.add(root.val);
        currsum += root.val;

        if (currsum == targetSum && root.left == null && root.right == null) {
            biggerlist.add(new ArrayList<>(list));
        }

        preorder(root.left, targetSum, biggerlist, list, currsum);
        preorder(root.right, targetSum, biggerlist, list, currsum);

        // backtracking
        list.remove(list.size() - 1);
    }

    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> biggerlist = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        preorder(root, targetSum, biggerlist, list, 0);
        return biggerlist;
    }

    // main function
    public static void main(String[] args) {

        /*
            Tree:
                    5
                   / \
                  4   8
                 /   / \
                11  13  4
               /  \     / \
              7    2   5   1

            TargetSum = 22
            Output:
            [5,4,11,2]
            [5,8,4,5]
        */

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);

        int targetSum = 22;

        List<List<Integer>> result = pathSum(root, targetSum);

        // Output
        System.out.println("Paths with sum " + targetSum + ":");
        for (List<Integer> path : result) {
            System.out.println(path);
        }
    }
}
