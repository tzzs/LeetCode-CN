/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] reversePrint(ListNode head) {
        ListNode newhead = null, tmp = null;
        int count = 0;
        while (head != null) {
            tmp = head;
            head = head.next;
            tmp.next = newhead;
            newhead = tmp;
            count++;
        }

        int[] array = new int[count];
        int i = 0;
        while (newhead != null) {
            array[i++] = newhead.val;
            newhead = newhead.next;
        }

        return array;
    }
}
