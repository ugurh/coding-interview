package problems;

public class ReverseLinkedList {
    // LinkedList Node
    static class Node {
        int value;
        Node next;
    }

    public static void reverse(Node head) {
        if (head == null) {
            return;
        } else {
            reverse(head.next);
            System.out.print(head.value + " ");
        }
    }

    static Node insertHead(Node tempHead, int newValue) {
        Node newNode = new Node();
        newNode.value = newValue;
        newNode.next = (tempHead);
        tempHead = newNode;

        return tempHead;
    }

    public static void main(String args[]) {
        // Empty Linked List
        Node head;

        // Linked List = 1->2->3->4->5
        head = insertHead(null, 5);
        head = insertHead(head, 4);
        head = insertHead(head, 3);
        head = insertHead(head, 2);
        head = insertHead(head, 1);

        // Print the original Linked List
        System.out.println("Linked List: ");
        for (Node i = head; i != null; i = i.next) {
            System.out.print(i.value + " ");
        }

        // Print the reversed Linked List
        System.out.println(" ");
        System.out.println("Reversed Linked List: ");
        reverse(head);
    }
}