/*
25.Reverse Nodes in k-Group
Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
k is a positive integer and is less than or equal to the length of the linked list.
If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

Yun-Chi Hsiao
Jul.22nd.2021
*/

public class ReverseNodesInKGroup {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode currNode = head;
        ListNode prevNode = null;
        int pairSize = k;

        while (pairSize > 0 && currNode != null){
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
            pairSize--;
        }

        if (pairSize > 0) prevNode = reverseKGroup(prevNode, k-pairSize);

        if (currNode != null) head.next = reverseKGroup(currNode, k);

        return prevNode;
    }
}
