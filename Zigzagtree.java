import java.util.*;

public class Zigzagtree {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nodes = sc.nextLine().split(" ");
        TreeNode root = buildTree(nodes);
        printZigZag(root);
    }

    private static TreeNode buildTree(String[] nodes) {
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
        queue.offer(root);

        for (int i = 1; i < nodes.length; i += 2) {
            TreeNode curr = queue.poll();
            if (!nodes[i].equals("-1")) {
                curr.left = new TreeNode(Integer.parseInt(nodes[i]));
                queue.offer(curr.left);
            }
            if (i + 1 < nodes.length && !nodes[i + 1].equals("-1")) {
                curr.right = new TreeNode(Integer.parseInt(nodes[i + 1]));
                queue.offer(curr.right);
            }
        }
        return root;
    }

    private static void printZigZag(TreeNode root) {
        if (root == null)
            return;

        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean isReverse = false;

        while (!queue.isEmpty()) {
            int size = queue.size();
            Deque<Integer> levelValues = new LinkedList<>();

            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();

                if (isReverse) {
                    levelValues.offerFirst(curr.val);
                } else {
                    levelValues.offerLast(curr.val);
                }

                if (curr.left != null) {
                    queue.offer(curr.left);
                }
                if (curr.right != null) {
                    queue.offer(curr.right);
                }
            }
            for (int val : levelValues) {
                System.out.print(val + " ");
            }
            System.out.println();
            isReverse = !isReverse;
        }
    }
}
