/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：38.6 MB，在所有 Java 提交中击败了 23.41% 的用户
 */
class Solution {
    private int ans = 1;
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        getDepth(root, 1);
        return ans;
    }
    
    public void getDepth(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            ans = Math.max(ans, depth);
            return;
        }
        getDepth(root.left, depth + 1);
        getDepth(root.right, depth + 1);
    }
}
/**
 * 给定一个二叉树，找出其最大深度。
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 */