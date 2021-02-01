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
    public ListNode oddEvenList(ListNode head) {
        ListNode p1, p2, a;
        if (head != null && head.next != null) {
            a = head.next;
        } else {
            return head;
        }
        p1 = head;
        p2 = a;
        while (p1 != null && p1.next != null && p1.next.next != null && p2 != null && p2.next != null) {
            p1.next = p1.next.next;
            p1 = p1.next;
            p2.next = p2.next.next;
            p2 = p2.next;
        }
        p1.next = a;
        return head;
    }
}