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

  public int maxDepth(TreeNode root)
