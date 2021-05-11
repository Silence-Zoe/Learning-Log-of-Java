/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：36.5 MB，在所有 Java 提交中击败了 52.47% 的用户
 */
class Solution {
    Node n = new Node();
    Node pn = n;
    public Node flatten(Node head) {
        if (head == null) {
            return head;
        }
        Node p = head;
        while (p.next != null || p.next == null && p.child != null) {
            while (p.child != null) {
                if (p.next != null) {
                    pn.next = new Node();
                    pn.next.prev = pn;
                    pn.next.child = p.next;
                    pn = pn.next;
                }
                p.next = p.child;
                p.child = null;
                p.next.prev = p;
                p = p.next;
            }
            if (p.next != null) {
                p = p.next;
            }
        }
        for (; pn != n; pn = pn.prev) {
            p.next = pn.child;
            p.next.prev = p;
            while (p.next != null) {
                p = p.next;
            }
        }
        return head;
    }
}
/**
 * 多级双向链表中，除了指向下一个节点和前一个节点指针之外，它还有一个子链表指针，可能指向单独的双向链表。这些子列表也可能会有一个或多个自己的子项，依此类推，生成多级数据结构，如下面的示例所示。
 * 给你位于列表第一级的头节点，请你扁平化列表，使所有结点出现在单级双链表中。
 * --------------------------------------------------
 * 提示：
 * 每节点数目不超过 1000
 * 1 <= Node.val <= 10^5
 */