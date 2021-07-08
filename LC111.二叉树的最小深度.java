/**
 * 执行用时：8 ms，在所有 Java 提交中击败了 55.64% 的用户
 * 内存消耗：58.8 MB，在所有 Java 提交中击败了 61.80% 的用户
 */
class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        if (root.left == null) {
            return 1 + minDepth(root.right);
        }

        if(root.right == null) {
            return 1+ minDepth(root.left);
        }

        return Math.min(1 + minDepth(root.left), 1 + minDepth(root.right));

    }
}
/**
 * 给定一个二叉树，找出其最小深度。
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 * --------------------------------------------------
 * 提示：
 * 树中节点数的范围在 [0, 10^5] 内
 * -1000 <= Node.val <= 1000
*/
