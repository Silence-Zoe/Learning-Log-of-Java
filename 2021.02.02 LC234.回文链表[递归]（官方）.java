/**
 * 执行用时：21 ms，在所有 Java 提交中击败了 6.36% 的用户
 * 内存消耗：55.4 MB，在所有 Java 提交中击败了 5.75% 的用户
 */
class Solution {
    private ListNode frontPointer;
    private boolean recursivelyCheck(ListNode currentNode) {
        if (currentNode != null) {
            if (!recursivelyCheck(currentNode.next)) {
                return false;
            }
            if (currentNode.val != frontPointer.val) {
                return false;
            }
            frontPointer = frontPointer.next;
        }
        return true;
    }
    public boolean isPalindrome(ListNode head) {
        frontPointer = head;
        return recursivelyCheck(head);
    }
}
/**
 * 请判断一个链表是否为回文链表。
 */