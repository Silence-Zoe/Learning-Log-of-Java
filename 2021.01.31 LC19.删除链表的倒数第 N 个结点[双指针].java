/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：36.6 MB，在所有 Java 提交中击败了 12.95% 的用户
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) {
            return null;
        }
        ListNode p1 = head;
        ListNode p2 = head;
        for (int i = 0; i < n ; i++) {
            p2 = p2.next;
        }
        if (p2 == null) {
            return head.next;
        }
        while (p1 != null) {  
            if (p2.next == null && p1.next != null) {
               p1.next = p1.next.next; 
               break;
            }
            p1 = p1.next;
            p2 = p2.next;  
        }
        return head;
    }
}
/**
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * --------------------------------------------------
 * 提示：
 * 链表中结点的数目为 sz
 * 1 <= sz <= 30
 * 0 <= Node.val <= 100
 * 1 <= n <= sz
 */
