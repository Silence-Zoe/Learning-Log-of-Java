/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 72.80% 的用户
 * 内存消耗：38.1 MB，在所有 Java 提交中击败了 62.46% 的用户
 */
class Solution {
    int pre;
    int ans;

    public int getMinimumDifference(TreeNode root) {
        ans = Integer.MAX_VALUE;
        pre = -1;
        dfs(root);
        return ans;
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        if (pre == -1) {
            pre = root.val;
        } else {
            ans = Math.min(ans, root.val - pre);
            pre = root.val;
        }
        dfs(root.right);
    }
}
/**
 * 给你一棵所有节点为非负值的二叉搜索树，请你计算树中任意两节点的差的绝对值的最小值。
 * --------------------------------------------------
 * 提示：
 * 树中节点总数在范围 [2, 10^4] 内
 * 0 <= Node.val <= 10^5
 */
