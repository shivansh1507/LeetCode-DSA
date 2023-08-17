import java.util.Scanner;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class Binarystree {
    Node root;

    public Binarystree() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        Binarystree tree = new Binarystree();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements to insert: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            // System.out.print("Enter element " + (i + 1) + ": ");
            int element = scanner.nextInt();
            tree.insert(element);
        }

        scanner.close();

        tree.inorder();
    }
}
