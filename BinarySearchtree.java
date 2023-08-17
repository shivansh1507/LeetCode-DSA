import java.util.Scanner;

public class BinarySearchtree {
    static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;

    public BinarySearchtree() {
        this.root = null;
    }

    public void insert(int value) {
        this.root = insert(this.root, value);
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            return new Node(value);
        } else if (value < node.value) {
            node.left = insert(node.left, value);
        } else if (value > node.value) {
            node.right = insert(node.right, value);
        }
        return node;
    }

    public void preorderTraversal() {
        preorderTraversal(this.root);
    }

    private void preorderTraversal(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.value + " ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BinarySearchtree bst = new BinarySearchtree();
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            bst.insert(value);
        }
        bst.preorderTraversal();
    }
}
