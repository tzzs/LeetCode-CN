/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean flag = false;// 进位标志
        ListNode l = l1, tail = l1;
        int k;
        while (l1 != null || l2 != null) {
            k = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + (flag ? 1 : 0);
            flag = false;
            if (k > 9) {
                flag = true;
                k = k % 10;
            }
            if (l1 != null) {
                l1.val = k;
                tail = l1;
            } else {
                ListNode n = new ListNode(k);
                tail.next = n;
                tail = n;
            }
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        if (flag) {
            ListNode n = new ListNode(1);
            tail.next = n;
            tail = n;
        }
        return l;
    }
}