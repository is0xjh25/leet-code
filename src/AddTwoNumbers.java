/*
2.Add Two Numbers
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Yun-Chi Hsiao
Jul.2nd.2021
 */

public class AddTwoNumbers {

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode ans = new ListNode();
        ListNode current = new ListNode();
        int add = 0;
        boolean start = true;

        while (l1 != null || l2 != null ) {

            ListNode temp = new ListNode();

            if (l1 != null && l2 != null) {
                temp.val = (add + l1.val + l2.val) % 10;
                add = (add + l1.val + l2.val > 9) ? 1 : 0;
                current.next = temp;
                current = temp;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 != null) {
                temp.val = (add + l1.val) % 10;
                add = (add + l1.val > 9) ? 1 : 0;
                current.next = temp;
                current = temp;
                l1 = l1.next;
            } else {
                temp.val = (add + l2.val) % 10;
                add = (add + l2.val > 9) ? 1 : 0;
                current.next = temp;
                current = temp;
                l2 = l2.next;
            }

            if (start) {
                ans = current;
                start = false;
            }
        }

        if (add == 1) {
            current.next = new ListNode(1);
        }

        return ans;
    }
}
