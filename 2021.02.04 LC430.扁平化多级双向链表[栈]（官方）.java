/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 33.96% 的用户
 * 内存消耗：36.6 MB，在所有 Java 提交中击败了 42.06% 的用户
 */
class Solution {
    public Node flatten(Node head) {
        if (head == null) {
            return head;
        }

        Node pseudoHead = new Node(0, null, head, null);
        Node curr, prev = pseudoHead;

        Deque<Node> stack = new ArrayDeque<>();
        stack.push(head);

        while (!stack.isEmpty()) {
            curr = stack.pop();
            prev.next = curr;
            curr.prev = prev;

            if (curr.next != null) stack.push(curr.next);
            if (curr.child != null) {
                stack.push(curr.child);
                curr.child = null;
            }
            prev = curr;
        }
        pseudoHead.next.prev = null;
        return pseudoHead.next;
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