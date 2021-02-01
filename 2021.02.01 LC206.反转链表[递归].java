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
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        if (head.next.next == null) {
            ListNode ans = head.next;
            head.next.next = head;
            head.next = null;
            return ans;
        } 
        return reverse(head, head, head.next, head.next.next);
    }
    public ListNode reverse(ListNode head, ListNode a, ListNode b, ListNode c) {
        if (c == null) {
            b.next = a;
            head.next = null;
            return b;
        } else {
            b.next = a;
            return reverse(head, b, c, c.next);
        }
    }
}