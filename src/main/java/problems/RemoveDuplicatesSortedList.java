package problems;

public class RemoveDuplicatesSortedList {

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.val == current.next.val){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {
        //[1,1,2,3,3]
        ListNode listNode = new ListNode(1,
                new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(3)))));
        ListNode x = deleteDuplicates(listNode);
        System.out.println(x.val);
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}



