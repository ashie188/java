import java.util.Stack;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class BSTTraversalIterator {

    private Stack<Node> stack;

    public BSTTraversalIterator(Node root) {
        stack = new Stack<>();
        pushLeft(root);
    }

    public int next() {

        Node current = stack.pop();

        if (current.right != null) {
            pushLeft(current.right);
        }

        return current.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }

    private void pushLeft(Node node) {

        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }

    public static void main(String[] args) {

        Node root = new Node(7);
        root.left = new Node(3);

        root.right = new Node(15);
        root.right.left = new Node(9);
        root.right.right = new Node(20);

        BSTTraversalIterator iterator = new BSTTraversalIterator(root);

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}