/**
 * 执行用时：10 ms，在所有 Java 提交中击败了 25.53% 的用户
 * 内存消耗：50.9 MB，在所有 Java 提交中击败了 17.95% 的用户
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> vals = new ArrayList<Integer>();
        ListNode currentNode = head;
        while (currentNode != null) {
            vals.add(currentNode.val);
            currentNode = currentNode.next;
        }
        int front = 0;
        int back = vals.size() - 1;
        while (front < back) {
            if (!vals.get(front).equals(vals.get(back))) {
                return false;
            }
            front++;
            back--;
        }
        return true;
    }
}
/**
 * 请判断一个链表是否为回文链表。
 */