/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：37.8 MB，在所有 Java 提交中击败了 73.18% 的用户
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.next.val == current.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
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
