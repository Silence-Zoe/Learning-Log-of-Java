/**
 * 执行用时：5 ms，在所有 Java 提交中击败了 48.35% 的用户
 * 内存消耗：52.1 MB，在所有 Java 提交中击败了 10.80% 的用户
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        int cnt = 0;
        for (ListNode p = head; p!= null; p = p.next) {
            cnt++;
        }
        int a[] = new int[cnt];
        int i = 0;
        for (ListNode p = head; p != null; p = p.next) {
            a[i] = p.val;
            i++;
        }
        for (i = 1; i <= cnt / 2; i++) {
            if (a[i - 1] != a[cnt - i]) {
                return false;
            }
        }
        return true;
    }
}
/**
 * 请判断一个链表是否为回文链表。
 */