/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：38.8 MB，在所有 Java 提交中击败了 5.09% 的用户
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
/**
 * 反转一个单链表。
 */