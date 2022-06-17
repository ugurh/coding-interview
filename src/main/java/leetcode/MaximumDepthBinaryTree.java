package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class MaximumDepthBinaryTree {

    public static void main(String[] args) {

        Node root = new Node(3, new Node(9, null, null), new Node(20, new Node(15, null, null), new Node(7, null, null)));

        System.out.println(maxDepth(root));
    }

    public static int maxDepth(Node root) {
        if (root == null) return 0;
        int l = maxDepth(root.left), r = maxDepth(root.right);
        return Math.max(l, r) + 1;
    }

    public static int maxDepth2(Node root) {
        List<List<Integer>> result = new ArrayList<>();

        Stack<Node> stack = new Stack<>();
        Stack<Node> tempStack = new Stack<>();

        stack.push(root);

        while (!stack.isEmpty()) {
            List<Integer> list = new LinkedList<>();

            while (!stack.isEmpty()) {
                Node node = stack.pop();
                if (node != null) {
                    tempStack.push(node.left);
                    tempStack.push(node.right);
                }
            }

            if (!tempStack.empty()) {
                result.add(list);
            }

            while (!tempStack.isEmpty()) {
                stack.push(tempStack.pop());
            }
        }

        return result.size();
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
