/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：35.8 MB，在所有 Java 提交中击败了 43.05% 的用户
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        if (head.next == null) {
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return fast.next == null ? slow : slow.next;
    }
}
/**
 * 给定一个头结点为 head 的非空单链表，返回链表的中间结点。
 * 如果有两个中间结点，则返回第二个中间结点。
 * --------------------------------------------------
 * 提示：
 * 给定链表的结点数介于 1 和 100 之间。
 */