
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode l = head, r = head;

        while (k > 0 && r != null) {
            r = r.next;
            k--;
        }

        while (r != null) {
            l = l.next;
            r = r.next;
        }

        return l;
    }
}
