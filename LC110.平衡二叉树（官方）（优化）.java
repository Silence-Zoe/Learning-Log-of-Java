/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 99.99% 的用户
 * 内存消耗：38.6 MB，在所有 Java 提交中击败了 35.65% 的用户
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        return height(root) >= 0;
    }

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        } else {
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}
/**
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 * 本题中，一棵高度平衡二叉树定义为：
 *     一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。
 * --------------------------------------------------
 * 提示：
 * 树中的节点数在范围 [0, 5000] 内
 * -10^4 <= Node.val <= 10^4
 */
