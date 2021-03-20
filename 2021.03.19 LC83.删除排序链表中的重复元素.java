/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：38 MB，在所有 Java 提交中击败了 32.67% 的用户
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        for (; cur != null; cur = cur.next, pre = pre.next) {
            while (cur.val == pre.val) {
                cur = cur.next;
                if (cur == null) {
                    pre.next = cur;
                    return head;
                }
            }
            pre.next = cur;
        }
        return head;
    }
}
/**
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * --------------------------------------------------
 * 提示：
 * 链表中节点的数目范围是 [0, 300]
 * -100 <= Node.val <= 100
 */
