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
        if (head == null || head.next == null) {
            return head;
        }
        ListNode last = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }
}
/**
 * 3->4->5
 * last 计算得出为5
 * 但是head.next指向的还是原来的4，4->5转换后，4已经成为了结尾，所以将4.next指向head此时翻转完成。
 * 3—>4(head.next)->3 此时last(5)->4->3
 * 
 */
