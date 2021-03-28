/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode newHead = null;

        while (head != null) {
            ListNode tmp = new ListNode(head.val);
            tmp.next = newHead;
            newHead = tmp;
            head = head.next;
        }

        return newHead;
    }
}
