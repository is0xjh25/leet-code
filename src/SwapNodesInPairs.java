/*
24.Swap Nodes in Pairs
Given a linked list, swap every two adjacent nodes and return its head.
You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

Yun-Chi Hsiao
Jul.22nd.2021
 */

public class SwapNodesInPairs {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

    public ListNode swapPairs(ListNode head) {

        if (head == null) return null;
        if (head.next == null) return head;

        ListNode temp = new ListNode();
        ListNode record = temp;
        ListNode previous = null;
        int index = 0;

        while (head != null) {

            index++;

            if (index%2 == 1) {
                if (head.next == null) {
                    temp.next = head;
                    break;
                }
                previous = new ListNode(head.val);
            } else if (index%2 == 0) {
                temp.next = new ListNode(head.val);
                temp = temp.next;
                temp.next = previous;
                temp = temp.next;
            }

            head = head.next;
        }

        return record.next;
    }
}
