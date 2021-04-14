/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 99.81% 的用户
 * 内存消耗：39.6 MB，在所有 Java 提交中击败了 25.49% 的用户
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
/**
 * 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
 * --------------------------------------------------
 * 提示：
 * 列表中的节点在范围 [0, 10^4] 内
 * 1 <= Node.val <= 50
 * 0 <= k <= 50
 */