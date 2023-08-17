import java.util.*;

public class BinarySearchtreeS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode root = null;

        while (sc.hasNext()) {
            int value = sc.nextInt();
            root = insert(root, value);
        }

        System.out.println("Preorder Traversal:");
        preorderTraversal(root);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }

        if (value < root.val) {
            root.left = insert(root.left, value);
        } else if (value > root.val) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    public static void preorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.print(node.val + " ");

            if (node.right != null) {
                stack.push(node.right);
            }

            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }
}
