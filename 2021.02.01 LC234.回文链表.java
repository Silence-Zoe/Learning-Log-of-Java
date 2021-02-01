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
import java.util.ArrayList; 
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        int cnt = 0;
        for (ListNode p = head; p!= null; p = p.next) {
            cnt++;
        }
        int a[] = new int[cnt];
        int i = 0;
        for (ListNode p = head; p != null; p = p.next) {
            a[i] = p.val;
            i++;
        }
        for (i = 1; i <= cnt / 2; i++) {
            if (a[i - 1] != a[cnt - i]) {
                return false;
            }
        }
        return true;
    }
}