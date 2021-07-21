/*
21. Merge Two Sorted Lists
Merge two sorted linked lists and return it as a sorted list.
The list should be made by splicing together the nodes of the first two lists

Yun-Chi Hsiao
Jul.21st.2021
 */

public class MergeTwoSortedLists {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode head = new ListNode(0);
        ListNode temp = head;

        if (l1 == null && l2 == null) return null;

        while (l1 != null || l2 != null) {
            if (l1 == null) {
                temp.next = l2;
                l2 = l2.next;
            } else if (l2 == null) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                if (l1.val <= l2.val) {
                    temp.next = l1;
                    l1 = l1.next;
                } else {
                    temp.next = l2;
                    l2 = l2.next;
                }
            }
            temp = temp.next;
        }

        return head.next;
    }
}
