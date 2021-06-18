/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：36.2 MB，在所有 Java 提交中击败了 61.38% 的用户
 */
class Solution {
    private int sum = 0;
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val;
        }

        sumOfLeftLeaves(root.left);
        sumOfLeftLeaves(root.right);
        
        return sum;
    }
}
/**
 * 计算给定二叉树的所有左叶子之和。
 * --------------------------------------------------
 * 提示：
 * 树中的节点数在范围 [1, 1000] 内
 * -1000 <= Node.val <= 1000
 */