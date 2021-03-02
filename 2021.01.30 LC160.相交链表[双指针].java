/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：41 MB，在所有 Java 提交中击败了 88.47% 的用户
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode slow = headA;
        ListNode fast = headB;
        int n1, n2, n3;
        n1 = n2 = n3 = 0;
        while (slow.next != null) {
            n1++;
            slow = slow.next;
        }
        n1++;
        while (fast.next != null) {
            n2++;
            fast = fast.next;
        }
        n2++;
        if (fast != slow) {
            return null;
        }
        n3 = Math.abs(n1-n2);
        slow = headA;
        fast = headB;
        if (n2 < n1) {
            ListNode t = new ListNode();
            t = slow;
            slow = fast;
            fast = t;
        }
        for (int i = 0; i < n3; i++) {
            fast = fast.next;
        }
        while (slow != fast && slow.next != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
/**
 * 编写一个程序，找到两个单链表相交的起始节点。
 * --------------------------------------------------
 * 提示：
 * 如果两个链表没有交点，返回 null.
 * 在返回结果后，两个链表仍须保持原有的结构。
 * 可假定整个链表结构中没有循环。
 * 程序尽量满足 O(n) 时间复杂度，且仅用 O(1) 内存。
 */