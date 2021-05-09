/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：35.8 MB，在所有 Java 提交中击败了 92.79% 的用户
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummyhead = new ListNode(-1, head.next);
        swap(head);
        return dummyhead.next;
    }

    private void swap(ListNode p) {
        if (p == null || p.next == null) {
            return;
        }
        ListNode a = p.next;
        ListNode b = a.next;
        a.next = p;
        if (b == null) {
            p.next = null;
            return;
        }
        ListNode c = b.next;
        p.next = c == null ? b : c;
        swap(b);
        
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