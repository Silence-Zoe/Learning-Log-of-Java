/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：41.4 MB，在所有 Java 提交中击败了 23.10% 的用户
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }
}/**
 * 编写一个程序，找到两个单链表相交的起始节点。
 * --------------------------------------------------
 * 提示：
 * 如果两个链表没有交点，返回 null.
 * 在返回结果后，两个链表仍须保持原有的结构。
 * 可假定整个链表结构中没有循环。
 * 程序尽量满足 O(n) 时间复杂度，且仅用 O(1) 内存。
 */