/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 72.80% 的用户
 * 内存消耗：38.3 MB，在所有 Java 提交中击败了 37.07% 的用户
 */
class Solution {
    private int min = Integer.MAX_VALUE;
    private int pre = -1;
    public int getMinimumDifference(TreeNode root) {
        if (root.left != null) {
            getMinimumDifference(root.left);
        }

        if (pre >= 0) {
            min = Math.min(min, Math.abs(pre - root.val));
        }
        pre = root.val;

        if (root.right != null) {
            getMinimumDifference(root.right);
        }

        return min;
    }
}
/**
 * 给你一棵所有节点为非负值的二叉搜索树，请你计算树中任意两节点的差的绝对值的最小值。
 * --------------------------------------------------
 * 提示：
 * 树中节点总数在范围 [2, 10^4] 内
 * 0 <= Node.val <= 10^5
 */