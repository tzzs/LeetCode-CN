
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) return null;
        if (head.val == val) return head.next;
        
        ListNode cur = head.next;
        ListNode pre = head;

        while (cur.val != val) {
            cur = cur.next;
            pre = pre.next;
        }

        pre.next = cur.next;

        return head;
    }
}
