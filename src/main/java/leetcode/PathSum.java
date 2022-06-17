package leetcode;

public class PathSum {
    static int sum = 0;
    static boolean flag = false;

    public static void main(String[] args) {
        Node root = new Node(5, new Node(4, new Node(11, new Node(7, null, null), new Node(2, null, null)), null), new Node(8, new Node(13, null, null), new Node(4, null, new Node(1, null, null))));

        System.out.println(hasPathSum(root, 22));
    }


    public static boolean hasPathSum(Node root, int targetSum) {
        if (root == null) {
            return false;
        }


        sum += root.val;
        if (root.right == null && root.left == null) {
            return sum == targetSum;
        }

        hasPathSum(root.right, targetSum);
        hasPathSum(root.left, targetSum);

        sum -= root.val;

        return false;
    }


    static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


}
