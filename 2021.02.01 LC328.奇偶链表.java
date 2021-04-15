/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：38 MB，在所有 Java 提交中击败了 80.51% 的用户
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        ListNode p1, p2, a;
        if (head != null && head.next != null) {
            a = head.next;
        } else {
            return head;
        }
        p1 = head;
        p2 = a;
        while (p1 != null && p1.next != null && p1.next.next != null && p2 != null && p2.next != null) {
            p1.next = p1.next.next;
            p1 = p1.next;
            p2.next = p2.next.next;
            p2 = p2.next;
        }
        p1.next = a;
        return head;
    }
}
/**
 * 给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。请注意，这里的奇数节点和偶数节点指的是节点编号的奇偶性，而不是节点的值的奇偶性。
 * 请尝试使用原地算法完成。你的算法的空间复杂度应为 O(1)，时间复杂度应为 O(nodes)，nodes 为节点总数。
 * --------------------------------------------------
 * 提示：
 * 应当保持奇数节点和偶数节点的相对顺序。
 * 链表的第一个节点视为奇数节点，第二个节点视为偶数节点，以此类推。
 */