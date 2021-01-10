/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        if (head == null)
            return head;
        ListNode l = head, d1 = head, d2 = head;
        // double pointers;

        int count = 1;
        int ln, tmp;
        while (count < k) {
            d2 = d2.next;
            count++;
        }

        l = d2;
        ln = l.val;
        // System.out.println(ln);

        while (d2.next != null) {
            d1 = d1.next;
            d2 = d2.next;
        }
        // System.out.println(d1.val);

        tmp = d1.val;
        d1.val = ln;
        l.val = tmp;

        return head;
    }
}
