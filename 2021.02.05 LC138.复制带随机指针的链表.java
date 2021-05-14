/**
 * 执行用时：3 ms，在所有 Java 提交中击败了 14.64% 的用户
 * 内存消耗：37.4 MB，在所有 Java 提交中击败了 99.87% 的用户
 */
class Solution {
    public Node copyRandomList(Node head) {
        Node dummyhead = new Node(-1);
        dummyhead.next = null;
        Node p1 = dummyhead;
        Node p2 = head;
        for (; p2 != null; p2 = p2.next, p1 = p1.next) {
            p1.next = new Node(p2.val);
        }
        p1.next = null;
        p1 = dummyhead.next;
        p2 = head;
        Node c = head;
        int cnt = 0;
        for (; p1 != null; p1 = p1.next, p2 = p2.next) {
            if (p2.random == null) {
                p1.random = null;
            } else {
                for (cnt = 0, c = head; c != p2.random; c = c.next ) {
                    cnt ++;
                }
                c = dummyhead.next;
                for (int i = 0; i < cnt; i++, c = c.next) {
                    ;
                }
                p1.random = c;
            }
        }
        return dummyhead.next;
    }
}
/**
 * 给你一个长度为 n 的链表，每个节点包含一个额外增加的随机指针 random ，该指针可以指向链表中的任何节点或空节点。
 * 构造这个链表的 深拷贝。 深拷贝应该正好由 n 个 全新 节点组成，其中每个新节点的值都设为其对应的原节点的值。新节点的 next 指针和 random 指针也都应指向复制链表中的新节点，并使原链表和复制链表中的这些指针能够表示相同的链表状态。复制链表中的指针都不应指向原链表中的节点 。
 * 例如，如果原链表中有 X 和 Y 两个节点，其中 X.random --> Y 。那么在复制链表中对应的两个节点 x 和 y ，同样有 x.random --> y 。
 * 返回复制链表的头节点。
 * 用一个由 n 个节点组成的链表来表示输入/输出中的链表。每个节点用一个 [val, random_index] 表示：
 *     val：一个表示 Node.val 的整数。
 *     random_index：随机指针指向的节点索引（范围从 0 到 n-1）；如果不指向任何节点，则为  null 。
 * 你的代码 只 接受原链表的头节点 head 作为传入参数。
 * --------------------------------------------------
 * 提示：
 * 0 <= n <= 1000
 * -10000 <= Node.val <= 10000
 * Node.random 为空（null）或指向链表中的节点。
 */