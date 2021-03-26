/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：37.6 MB，在所有 Java 提交中击败了 89.30% 的用户
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyhead = new ListNode(-1, head);
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p1, p2, p3;
        p1 = dummyhead;
        p2 = head;
        p3 = head.next;
        
        while (p3 != null) {
            if (p2.val != p3.val) {
                p1 = p1.next;
            }
            while (p3.val == p2.val) {
                p3 = p3.next;
                p1.next = p3;
                if (p3 == null) {
                    return dummyhead.next;
                }
            }
            p2 = p3;
            p3 = p3.next;
        }
        return dummyhead.next;
    }
}
/**
 * 存在一个按升序排列的链表，给你这个链表的头节点 head ，请你删除链表中所有存在数字重复情况的节点，只保留原始链表中 没有重复出现 的数字。
 * 返回同样按升序排列的结果链表。
 * --------------------------------------------------
 * 提示：
 * 链表中节点数目在范围 [0, 300] 内
 * -100 <= Node.val <= 100
 * 题目数据保证链表已经按升序排列
 */