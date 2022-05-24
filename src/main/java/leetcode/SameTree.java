package leetcode;

public class SameTree {

    public static void main(String[] args) {

        Node p = new Node(1, new Node(2, null, null), new Node(3, new Node(1, null, null), null));
        Node q = new Node(1, new Node(2, null, null), new Node(3, new Node(1, null, null), null));

        System.out.println(isSameTree(p, q));
    }

    private static boolean isSameTree(Node p, Node q) {

        if (p == null && q == null) {
            return true;
        }

        if (p == null ^ q == null)
            return false;

        if (p.val != q.val)
            return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
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
