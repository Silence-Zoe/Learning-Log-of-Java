/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：38.5 MB，在所有 Java 提交中击败了 82.48% 的用户
 */
class Solution {
    public Node connect(Node root) {
        Node p = root;
        if (p == null) {
            return p;
        }
        help(root.left, root.right);
        return root;
    }

    public void help(Node l, Node r) {
        if (l == null) {
            return;
        }
        l.next = r;
        Node p = l, q = r;
        while (p.left != null) {
            p.right.next = q.left;
            p = p.right;
            q = q.left;
        }
        help(l.left, l.right);
        help(r.left, r.right);
    }
}
/**
 * 给定一个 完美二叉树 ，其所有叶子节点都在同一层，每个父节点都有两个子节点。二叉树定义如下：
 *     struct Node {
 *       int val;
 *       Node *left;
 *       Node *right;
 *       Node *next;
 *     }
 * 填充它的每个 next 指针，让这个指针指向其下一个右侧节点。如果找不到下一个右侧节点，则将 next 指针设置为 NULL。
 * 初始状态下，所有 next 指针都被设置为 NULL。
 * --------------------------------------------------
 * 提示：
 * 树中节点的数量少于 4096
 * -1000 <= node.val <= 1000
 */