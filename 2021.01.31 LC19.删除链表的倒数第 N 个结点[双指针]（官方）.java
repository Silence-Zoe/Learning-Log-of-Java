/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：36.4 MB，在所有 Java 提交中击败了 58.19% 的用户
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode dummy = new ListNode(0, head);
      ListNode first = head;
      ListNode second = dummy;
      for (int i = 0; i < n; i++) {
          first = first.next;
      }
      while (first != null) {
          first = first.next;
          second = second.next;
      }
      second.next = second.next.next;
      ListNode ans = dummy.next;
      return ans;
    }
}
/**
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * --------------------------------------------------
 * 提示：
 * 链表中结点的数目为 sz
 * 1 <= sz <= 30
 * 0 <= Node.val <= 100
 * 1 <= n <= sz
 */
