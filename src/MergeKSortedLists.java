/*
23.Merge k Sorted Lists
You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
Merge all the linked-lists into one sorted linked-list and return it.

Yun-Chi Hsiao
Jul.21st.2021
 */

public class  MergeKSortedLists {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeKLists(ListNode[] lists) {

        ListNode head = new ListNode(0);
        ListNode temp = head;

        while (true) {

            boolean exist = false;
            int min = -1;
            int min_index = 0;

            for (int i = 0; i < lists.length; i++) {

                if (lists[i] == null) {
                    continue;
                } else {
                    if (lists[i].val < min) {
                        min = lists[i].val;
                        min_index = i;
                    }
                    exist = true;
                }
            }

            if (exist) {
                temp.next = lists[min_index];
                temp = temp.next;
                lists[min_index] = lists[min_index].next;
            } else {
                break;
            }
        }

        return head.next;
    }
}
