/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：35.7 MB，在所有 Java 提交中击败了 99.36% 的用户
 */
class Solution {
    int pre;
    int ans;

    public int minDiffInBST(TreeNode root) {
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
 * 给你一个二叉搜索树的根节点 root ，返回 树中任意两不同节点值之间的最小差值 。
 * --------------------------------------------------
 * 提示：
 * 差值是一个正数，其数值等于两值之差的绝对值
 * 树中节点总数在范围 [2, 100] 内
 * 0 <= Node.val <= 10^5
 */