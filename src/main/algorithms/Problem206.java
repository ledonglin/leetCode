package algorithms;

/**
 * 206. Reverse Linked List
 * Reverse a singly linked list.
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
public class Problem206 {


    public ListNode reverseList(ListNode head) {
        ListNode result = null;
        ListNode cur = head;
        ListNode next;

        while (cur != null) {
            next = cur.next;
            cur.next = result;
            result = cur;
            cur = next;
        }
        return result;
    }


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}

