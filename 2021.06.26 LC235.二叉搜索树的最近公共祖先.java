/**
 * 执行用时：6 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：39.2 MB，在所有 Java 提交中击败了 65.98% 的用户
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || (root.val - p.val) * (root.val - q.val) <= 0) {
            return root;
        }

        if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        }

        if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        }

        return null;
    }
}
/**
 * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
 * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
 * --------------------------------------------------
 * 提示：
 * 树中节点总数在范围 [2, 10^5] 内
 * -10^9 <= Node.val <= 10^9
 * 所有节点的值都是唯一的。
 * p、q 为不同节点且均存在于给定的二叉搜索树中。
 */