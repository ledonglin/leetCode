package algorithms;


/**
 * Add Two Numbers
 * <p>
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example:
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class Problem2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean carry = false;
        ListNode head = null;
        ListNode result = null;

        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + (carry ? 1: 0);

            if (sum / 10 > 0) {
                carry = true;
            } else {
                carry = false;
            }

            ListNode m = new ListNode(sum % 10);

            if (result == null) {
                head = result = m;
            } else {
                result.next = m;
                result = m;
            }

            l1 = l1.next;
            l2 = l2.next;
        }


        ListNode list = l1 != null ? l1 : l2;
        while (list != null) {
            if (carry) {
                list.val += 1;
                if (list.val / 10 > 0) {
                    list.val = 0;
                    carry = true;
                } else {
                    carry = false;
                }
            }

            result.next = list;
            result = list;
            list = list.next;
        }

        if (carry) {
            ListNode m = new ListNode(1);
            result.next = m;
        }

        return head;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}


