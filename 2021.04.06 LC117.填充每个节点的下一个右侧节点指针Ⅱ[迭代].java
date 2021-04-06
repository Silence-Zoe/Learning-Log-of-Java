/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 62.70% 的用户
 * 内存消耗：38.4 MB，在所有 Java 提交中击败了 5.11% 的用户
 */
class Solution {
    public Node connect(Node root) {
        if (root == null) {
            return root;
        }
        Node head = root;
        while (head != null) {
            Node p = head;
            Node nexthead = null;
            while (head != null) {
                if (head.left != null) {
                    nexthead = head.left;
                    break;
                } else if (head.right != null) {
                    nexthead = head.right;
                    break;
                }
                head = head.next;
            }
            
            Node l = nexthead, r = nexthead;
            while (p != null) {         
                if (p.left == l && p.right != null) {
                    r = p.right;
                    l.next = r;
                    l = r;
                } else if (p.left != null || p.right != null) {
                    r = p.left != null ? p.left : p.right;
                }
                if (l != r) {
                    l.next = r;
                }
                if (p.left != null && p.right != null) {
                    p.left.next = p.right;
                    r = p.right;
                }
                l = r;
                p = p.next; 
            }
            head = nexthead;
        }
        return root;
    }
}
/**
 * 给定一个二叉树
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
 * 树中节点的数量小于 6000
 * -100 <= node.val <= 100
 */