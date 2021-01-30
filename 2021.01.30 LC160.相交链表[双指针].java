/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode slow = headA;
        ListNode fast = headB;
        int n1, n2, n3;
        n1 = n2 = n3 = 0;
        while (slow.next != null) {
            n1++;
            slow = slow.next;
        }
        n1++;
        while (fast.next != null) {
            n2++;
            fast = fast.next;
        }
        n2++;
        if (fast != slow) {
            return null;
        }
        n3 = Math.abs(n1-n2);
        slow = headA;
        fast = headB;
        if (n2 < n1) {
            ListNode t = new ListNode();
            t = slow;
            slow = fast;
            fast = t;
        }
        for (int i = 0; i < n3; i++) {
            fast = fast.next;
        }
        while (slow != fast && slow.next != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}