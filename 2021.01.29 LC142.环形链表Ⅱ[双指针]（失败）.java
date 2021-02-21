/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        int cnt, l, n1, n2, n3;
        cnt = n1 = n2 = n3 = -1;
        l = 0;
        ListNode Fast = head;
        ListNode Slow = head;
        while (Fast != null && Fast.next != null) {
            Fast = Fast.next.next;
            Slow = Slow.next;
            cnt++;
            if (Slow == Fast && n1 == -1) {
                n1 = cnt;
            } else if (n2 == -1) {
                n2 = cnt;
                l = n2 - n1;
                cnt = 0; 
            }
            if (n1 != -1 && n2 != -1) {
                Fast = head;
                Slow = head;
                while (Fast != null && Fast.next != null) {
                    for (int i = 0; i < l; i++) {
                        Fast = Fast.next;
                    }
                    Slow = Slow.next;
                    cnt++;
                    if (Fast == Slow) {
                        n3 = n1 - cnt;
                        ListNode x = head;//.next;
                        if (n3 != -1) {
                            for (int i = 0; i <= n3; i++) {
                                x = x.next;
                            }
                            return x;
                        }
                    }
                }
            }
        }
        return null;
    }
}
/**
 * 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 如果 pos 是 -1，则在该链表中没有环。注意，pos 仅仅是用于标识环的情况，并不会作为参数传递到函数中。
 * --------------------------------------------------
 *X 提示：
 * 你不能倾斜容器。
 * 链表中节点的数目范围在范围 [0, 104] 内
 * -105 <= Node.val <= 105
 * pos 的值为 -1 或者链表中的一个有效索引
 */