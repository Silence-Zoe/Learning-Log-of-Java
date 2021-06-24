/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：36 MB，在所有 Java 提交中击败了 65.76% 的用户
 */
class Solution {
    private int min = Integer.MAX_VALUE;
    private int pre = -1;
    public int minDiffInBST(TreeNode root) {
        if (root.left != null) {
            minDiffInBST(root.left);
        }

        if (pre >= 0) {
            min = Math.min(min, Math.abs(pre - root.val));
        }
        pre = root.val;

        if (root.right != null) {
            minDiffInBST(root.right);
        }

        return min;
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