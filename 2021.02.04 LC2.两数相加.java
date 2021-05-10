/**
 * 执行用时：2 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：38.9 MB，在所有 Java 提交中击败了 51.00% 的用户
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1, p2 = l2;
        ListNode ans = new ListNode(-1);
        ListNode p = ans;
        int sum = 0, a = 0, c = 0;
        while (p1 != null || p2 != null) {
            sum = 0;
            if (p1 != null) {
                sum += p1.val;
            }
            if (p2 != null) {
                sum += p2.val;
            }
            if (c == 1) {
                sum += 1;
            }
            a = sum % 10;
            c = sum / 10;
            p.next = new ListNode(a);
            p = p.next;
            if (p1 != null) {
                p1 = p1.next;
            }
            if (p2 != null) {
                p2 = p2.next;
            }
        }
        if (c == 1) {
            p.next = new ListNode(1);
        }
        return ans.next;
    }
}
/**
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * --------------------------------------------------
 * 提示：
 * 每个链表中的节点数在范围 [1, 100] 内
 * 0 <= Node.val <= 9
 * 题目数据保证列表表示的数字不含前导零
 */