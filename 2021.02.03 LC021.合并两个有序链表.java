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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return (l1 == null) ? l2 : l1;
        }
        ListNode p1 = l1, p2 = l2;
        ListNode head = (l1.val <= l2.val) ? l1 : l2;
        ListNode p = new ListNode();
        while (p1 != null && p2 != null) {
            p.next = (p1.val <= p2.val) ? p1 : p2; 
            if (p.next == p1) {
                p1 = p1.next;
            } else {
                p2 = p2.next;
            }
            p = p.next;
        }
        p.next = (p1 == null) ? p2 : p1;
        return head;
    }
}