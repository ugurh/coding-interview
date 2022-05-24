package leetcode;

public class SymmetricTree {

    public static void main(String[] args) {
        Node p = new Node(1, new Node(2, new Node(5, null, null), new Node(4, null, null)), new Node(2, new Node(4, null, null), new Node(3, null, null)));

        System.out.println(isSymmetric(p));
    }

    public static boolean isSymmetric(Node p) {

        if (p == null)
            return false;

        return isCheck(p.left, p.right);
    }

    private static boolean isCheck(Node left, Node right) {

        if (left == null && right == null)
            return true;

        if (left == null ^ right == null)
            return false;

        if (left.val != right.val)
            return false;

        return isCheck(left.left, right.right) && isCheck(left.right, right.left);
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
