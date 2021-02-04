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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1, p2 = l2;
        ListNode ans = new ListNode(-1);
        ListNode p = ans;
        int sum = 0, a = 0, c = 0;
        while (p1 != null || p2 != null) {
            sum = 0;
            if (p1 != null) {
                sum += p1.val;
            }
            if (p2 != null) {
                sum += p2.val;
            }
            if (c == 1) {
                sum += 1;
            }
            a = sum % 10;
            c = sum / 10;
            p.next = new ListNode(a);
            p = p.next;
            if (p1 != null) {
                p1 = p1.next;
            }
            if (p2 != null) {
                p2 = p2.next;
            }
        }
        if (c == 1) {
            p.next = new ListNode(1);
        }
        return ans.next;
    }
}