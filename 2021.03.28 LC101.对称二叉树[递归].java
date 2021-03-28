/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：36.7 MB，在所有 Java 提交中击败了 26.25% 的用户
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return jdg(root.left, root.right);
    }
    public boolean jdg(TreeNode p1, TreeNode p2) {
        if (p1 == null && p2 == null) {
            return true;
        }
        if (p1 == null || p2 == null) {
            return false;
        }
        return p1.val == p2.val && jdg(p1.left, p2.right) && jdg(p1.right, p2.left);
    }
}
/**
 * 给定一个二叉树，检查它是否是镜像对称的。
 */