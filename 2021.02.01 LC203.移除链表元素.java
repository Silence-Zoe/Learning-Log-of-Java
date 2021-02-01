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
    public ListNode removeElements(ListNode head, int val) {
        ListNode p1, p2;
        ListNode dummyhead = new ListNode(0, head);
        p1 = dummyhead;
        for (p2 = head; p2 != null; p1 = p1.next, p2 = p2.next) {
            while (p2 != null && p2.val == val) {
                p1.next = p2.next;
                p2 = p1.next;
            }
            if (p2 == null) {
                break;
            }
        }
        return dummyhead.next;
    }
}