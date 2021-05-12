/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 51.35% 的用户
 * 内存消耗：38.1 MB，在所有 Java 提交中击败了 9.58% 的用户
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        int l = 0;
        ListNode dummyhead = new ListNode(-1, head);
        ListNode prev = dummyhead, curr = head;
        for (; curr != null; curr = curr.next) {
            l++;
        }
        int x = l - ((k + l - 1) % l + 1);
        curr = head;
        for (int i = 0; i < x; i++) {
            prev = prev.next;
            curr = curr.next;
        }
        prev.next = null;
        ListNode ans = curr;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = dummyhead.next;
        return ans;
    }
}
/**
 * 给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。
 * --------------------------------------------------
 * 提示：
 * 链表中节点的数目在范围 [0, 500] 内
 * -100 <= Node.val <= 100
 * 0 <= k <= 2 * 10^9
 */