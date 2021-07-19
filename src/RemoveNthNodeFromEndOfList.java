/*
19.Remove Nth Node From End of List
Given the head of a linked list, remove the nth node from the end of the list and return its head.

Yun-Chi Hsiao
Jul.19th.2021
 */

import java.util.ArrayList;
import java.util.List;

public class RemoveNthNodeFromEndOfList {

    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp = head;
        List<ListNode> nodes = new ArrayList<>();
        nodes.add(head);

        while (temp.next != null) {
            temp = temp.next;
            nodes.add(temp);
        }

        if (nodes.size() == 1) {
            return null;
        } else {
            if (n == 1) {
                nodes.get(nodes.size()-n-1).next = null;
            } else if (nodes.size()-n-1 < 0) {
                return head.next;
            } else {
                nodes.get(nodes.size()-n-1).next = nodes.get(nodes.size()-n+1);
            }
        }

        return head;
    }
}
