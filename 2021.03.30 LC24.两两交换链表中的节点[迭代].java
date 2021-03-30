/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：36.3 MB，在所有 Java 提交中击败了 5.08% 的用户
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode dummy = new ListNode(-1, head);
        ListNode p = dummy, q = head;
        for (; q != null && q.next != null; q= q.next) {
            p.next = q.next;
            q.next = p.next.next;
            p.next.next = q;
            p = q;
            if (q == null) {
                break;
            }
        }
        return dummy.next;
    }
}
/**
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 * --------------------------------------------------
 * 提示：
 * 链表中节点的数目在范围 [0, 100] 内
 * 0 <= Node.val <= 100
 */