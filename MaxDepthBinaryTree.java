class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;

  TreeNode(int val) {
    this.val = val;
    this.left = null;
    this.right = null;
  }
}

public class MaxDepthBinaryTree {

  int maxheight = 0;

  public void preorder(TreeNode root, int count) {
    if (root == null) {
      return;
    }

    count++;

    if (root.left == null && root.right == null) {
      maxheight = Math.max(maxheight, count);
    }

    preorder(root.left, count);
    preorder(root.right, count);
  }

  public int maxDepth(TreeNode root) {
    if (root == null) return 0;
    int count = 0;
    preorder(root, count);
    return maxheight;
  }

  public static void main(String[] args) {
    /*
            1
           / \
          2   3
         /
        4
    */

    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);

    MaxDepthBinaryTree obj = new MaxDepthBinaryTree();
    int depth = obj.maxDepth(root);

    System.out.println("Maximum Depth of Binary Tree: " + depth);
  }
}
