/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode l = head, r = head;

        for (int i = 0; i < n; i++)
            r = r.next;

        if (r == null)
            return head.next;

        while (r != null && r.next != null) {
            l = l.next;
            r = r.next;
        }

        l.next = l.next.next;

        return head;
    }
}
