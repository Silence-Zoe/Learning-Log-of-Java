/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：36.6 MB，在所有 Java 提交中击败了 30.39% 的用户
 */
class Solution {
    public Node flatten(Node head) {
        if (head == null) {
            return head;
        }
        Node pseudoHead = new Node();
        pseudoHead.val = 0;
        pseudoHead.next = null;
        pseudoHead.prev = null;
        pseudoHead.child = null;

        flattenDFS(pseudoHead, head);

        pseudoHead.next.prev = null;
        return pseudoHead.next;
    }
    
    public Node flattenDFS(Node prev, Node curr) {
        if (curr == null) {
            return prev;
        }
        curr.prev = prev;
        prev.next = curr;

        Node tempNext = curr.next;

        Node tail = flattenDFS(curr, curr.child);
        curr.child = null;

        return flattenDFS(tail, tempNext);
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