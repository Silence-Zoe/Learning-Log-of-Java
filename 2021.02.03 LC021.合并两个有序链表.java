/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：37.7 MB，在所有 Java 提交中击败了 77.77% 的用户
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return (l1 == null) ? l2 : l1;
        }
        ListNode p1 = l1, p2 = l2;
        ListNode head = (l1.val <= l2.val) ? l1 : l2;
        ListNode p = new ListNode();
        while (p1 != null && p2 != null) {
            p.next = (p1.val <= p2.val) ? p1 : p2; 
            if (p.next == p1) {
                p1 = p1.next;
            } else {
                p2 = p2.next;
            }
            p = p.next;
        }
        p.next = (p1 == null) ? p2 : p1;
        return head;
    }
}
/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * --------------------------------------------------
 * 提示：
 * 两个链表的节点数目范围是 [0, 50]
 * -100 <= Node.val <= 100
 * l1 和 l2 均按 非递减顺序 排列
 */