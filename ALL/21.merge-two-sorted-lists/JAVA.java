/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode l;
        if (l1.val >= l2.val) {// 小的放在前面
            l = l2;
            l.next = mergeTwoLists(l1, l2.next);//获得后面的最小值 递归执行
        } else {
            l = l1;
            l.next = mergeTwoLists(l1.next, l2);
        }
        return l;
    }
}