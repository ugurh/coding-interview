package leetcode;

import java.util.*;

public class BinaryTreeLevelOrderTraversal {

    public static void main(String[] args) {

        Node root = new Node(3, new Node(9, null, null), new Node(20, new Node(15, null, null), new Node(7, null, null)));

        System.out.println(levelOrder(root));
        System.out.println(levelOrder2(root));

    }


    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();

        Stack<Node> stack = new Stack<>();
        Stack<Node> tempStack = new Stack<>();

        stack.push(root);

        while (!stack.empty()) {

            List<Integer> list = new LinkedList<>();

            while (!stack.empty()) {
                Node temp = stack.pop();
                if (temp != null) {
                    list.add(temp.val);
                    tempStack.push(temp.left);
                    tempStack.push(temp.right);
                }
            }

            if (!tempStack.empty()) {
                result.add(list);
            }

            while (!tempStack.empty()) {
                stack.push(tempStack.pop());
            }
        }

        return result;
    }

    public static ArrayList<List<Integer>> levelOrder2(Node root) {

        if (root == null)
            return null;

        ArrayList<List<Integer>> resultList = new ArrayList<>();

        Queue<Node> qu = new ArrayDeque<>();
        qu.offer(root);

        while (!qu.isEmpty()) {
            int size = qu.size();
            List<Integer> level = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                Node next = qu.poll();

                if (next == null)
                    break;

                level.add(next.val);
                if (next.left != null) {
                    qu.offer(next.left);
                }
                if (next.right != null) {
                    qu.offer(next.right);
                }
            }
            resultList.add(level);
        }
        return resultList;
    }


    public List<List<Integer>> levelOrder3(Node root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<List<Integer>> result = new ArrayList<>();
        helper(root, result, 0);
        return result;
    }

    public void helper(Node root, List<List<Integer>> list, int depth) {
        if (list.size() <= depth) {
            ArrayList<Integer> newList = new ArrayList<>();
            newList.add(root.val);
            list.add(newList);
        } else {
            list.get(depth).add(root.val);
        }

        if (root.left != null) {
            helper(root.left, list, depth + 1);
        }

        if (root.right != null) {
            helper(root.right, list, depth + 1);
        }
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
