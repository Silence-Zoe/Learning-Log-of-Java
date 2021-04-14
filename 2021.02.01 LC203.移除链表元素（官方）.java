/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 99.81% 的用户
 * 内存消耗：39.4 MB，在所有 Java 提交中击败了 54.66% 的用户
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;
        ListNode prev = sentinel, curr = head;
        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            } else {
                prev = curr;
            }
            curr = curr.next;
        }
        return sentinel.next;
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