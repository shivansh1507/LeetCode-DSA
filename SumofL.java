import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class SumofL {
    public static int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }

    public static int helper(TreeNode root, int currSum) {
        if (root == null) {
            return 0;
        }
        currSum = currSum * 10 + root.val;
        if (root.left == null && root.right == null) {
            return currSum;
        }
        int leftSum = helper(root.left, currSum);
        int rightSum = helper(root.right, currSum);
        return leftSum + rightSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        TreeNode root = buildTree(input, 0);
        int sum = sumNumbers(root);
        System.out.println(sum);
    }

    public static TreeNode buildTree(String[] input, int index) {
        if (index >= input.length || input[index].equals("-1")) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.parseInt(input[index]));

        root.left = buildTree(input, 2 * index + 1);
        root.right = buildTree(input, 2 * index + 2);

        return root;
    }
}
