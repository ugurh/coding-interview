package problems;

public class SearchValueLinkedList {

    static class Node {
        int value;
        Node next;
    }

    public static boolean isExist(Node head, int num) {
        for (Node node = head; node != null; node = node.next) {
            if (node.value == num)
                return true;
        }
        return false;
    }

    public static Node insert(Node head, int value) {
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = head;
        head = newNode;
        return head;

    }

    public static void main(String args[]) {
        Node head;

        // Linked List = 1->2->3->4->5
        head = insert(null, 5);
        head = insert(head, 4);
        head = insert(head, 3);
        head = insert(head, 2);
        head = insert(head, 1);

        int number = 6;
        boolean result = isExist(head, number);

        System.out.println(number + " is exist in Linked List: " + result);
    }

}
