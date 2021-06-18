/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：36.1 MB，在所有 Java 提交中击败了 65.25% 的用户
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        return root != null ? dfs(root) : 0;
    }

    public int dfs(TreeNode node) {
        int ans = 0;
        if (node.left != null) {
            ans += isLeafNode(node.left) ? node.left.val : dfs(node.left);
        }
        if (node.right != null && !isLeafNode(node.right)) {
            ans += dfs(node.right);
        }
        return ans;
    }

    public boolean isLeafNode(TreeNode node) {
        return node.left == null && node.right == null;
    }
}
/**
 * 计算给定二叉树的所有左叶子之和。
 * --------------------------------------------------
 * 提示：
 * 树中的节点数在范围 [1, 1000] 内
 * -1000 <= Node.val <= 1000
 */