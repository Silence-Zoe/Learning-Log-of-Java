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
        ListNode a, b, c;
        a = head;
        b = head.next;
        c = head.next.next;
        while (true) {
            b.next = a;
            if (c == null){
                break;
            } else {
                a = c.next;
                c.next = b;
            }
            if (a == null) {
                break;
            } else {
                b = a.next;
                a.next = c;
            }
            if (b == null) {
                break;
            } else {
                c = b.next;
            }
        }
        head.next = null;
        if (a == null) {
            return c;
        } else if (b == null) {
            return a;
        } else if (c == null) {
            return b;
        }
        return null;    //这句实际上不会走到，但必须要有返回值，只好写上
    }
}