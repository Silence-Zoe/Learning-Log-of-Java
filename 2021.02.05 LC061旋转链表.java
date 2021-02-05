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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        int l = 0;
        ListNode dummyhead = new ListNode(-1, head);
        ListNode prev = dummyhead, curr = head;
        for (; curr != null; curr = curr.next) {
            l++;
        }
        int x = l - ((k + l - 1) % l + 1);
        curr = head;
        for (int i = 0; i < x; i++) {
            prev = prev.next;
            curr = curr.next;
        }
        prev.next = null;
        ListNode ans = curr;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = dummyhead.next;
        return ans;
    }
}