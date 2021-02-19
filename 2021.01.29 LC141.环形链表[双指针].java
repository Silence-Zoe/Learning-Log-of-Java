/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 24.42% 的用户
 * 内存消耗：39.7 MB，在所有 Java 提交中击败了 5.04% 的用户
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        int pos = -1;
        ListNode Fast = head;
        ListNode Low = head;
        while (Fast != null && Fast.next != null && Fast.next.next != null && head.next != null && head.next.next != null) {
            Fast = Fast.next.next;
            Low = Low.next;
            if (Fast == Low) {
                pos = 1;
                break;
            }
        }
        if (pos == -1) {
            return false;
        } else {
            return true;
        }
    }
}
/**
 * 给定一个链表，判断链表中是否有环。
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
 * 如果链表中存在环，则返回 true 。 否则，返回 false 。
 * --------------------------------------------------
 * 提示：
 * 链表中节点的数目范围是 [0, 104]
 * -105 <= Node.val <= 105
 * pos 为 -1 或者链表中的一个 有效索引 。
 */