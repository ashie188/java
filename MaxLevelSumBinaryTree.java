import java.util.*;

// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class MaxLevelSumBinaryTree {

    public int maxLevelSum(TreeNode root) {
        int maxsum = Integer.MIN_VALUE;
        int maxlevel = 0;
        int currsum = 0;
        int currlevel = 0;

        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        queue.add(null);

        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();

            if (curr != null) {
                currsum += curr.val;

                if (curr.left != null) queue.add(curr.left);
                if (curr.right != null) queue.add(curr.right);

            } else {
                currlevel++;

                if (currsum > maxsum) {
                    maxsum = currsum;
                    maxlevel = currlevel;
                }

                currsum = 0;

                if (!queue.isEmpty()) {
                    queue.add(null);
                }
            }
        }
        return maxlevel;
    }

    // -------- MAIN METHOD --------
    public static void main(String[] args) {

        /*
              Input Tree:
                     1
                   /   \
                  7     0
                 / \     
                7  -8    

           Level 1 sum = 1
           Level 2 sum = 7 + 0 = 7
           Level 3 sum = 7 + (-8) = -1

           Output should be: 2
        */

        TreeNode root = new TreeNode(
                1,
                new TreeNode(
                        7,
                        new TreeNode(7),
                        new TreeNode(-8)
                ),
                new TreeNode(0)
        );

        MaxLevelSumBinaryTree obj = new MaxLevelSumBinaryTree();
        int result = obj.maxLevelSum(root);

        System.out.println("Level with maximum sum: " + result);
    }
}
