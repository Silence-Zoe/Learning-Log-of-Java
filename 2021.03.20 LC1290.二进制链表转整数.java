/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：36 MB，在所有 Java 提交中击败了 31.77% 的用户
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode p = head;
        int ans = head.val;
        for (; p.next != null; p = p.next) {
            ans = ans * 2 + p.next.val;
        }
        return ans;
    }
}
/**
 * 给你一个单链表的引用结点 head。链表中每个结点的值不是 0 就是 1。已知此链表是一个整数数字的二进制表示形式。
 * 请你返回该链表所表示数字的 十进制值 。
 * --------------------------------------------------
 * 提示：
 * 链表不为空。
 * 链表的结点总数不超过 30。
 * 每个结点的值不是 0 就是 1。
 */