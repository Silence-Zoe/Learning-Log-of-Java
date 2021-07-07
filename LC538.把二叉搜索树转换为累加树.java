/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 85.79% 的用户
 * 内存消耗：38.6 MB，在所有 Java 提交中击败了 62.86% 的用户
 */
class Solution {
    TreeNode pre;
    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return root;
        }
        
        if (root.right != null) {
            convertBST(root.right);
        }
        
        if (pre != null) { 
            root.val += pre.val;
        }
        pre = root;
        
        if (root.left != null) {
            convertBST(root.left);
        }

        return root;
    }
}
/**
 * 给出二叉 搜索 树的根节点，该树的节点值各不相同，请你将其转换为累加树（Greater Sum Tree），使每个节点 node 的新值等于原树中大于或等于 node.val 的值之和。
 * 提醒一下，二叉搜索树满足下列约束条件：
 *     节点的左子树仅包含键 小于 节点键的节点。
 *     节点的右子树仅包含键 大于 节点键的节点。
 *     左右子树也必须是二叉搜索树。
 * --------------------------------------------------
 * 提示：
 * 树中的节点数介于 0 和 10^4 之间。
 * 每个节点的值介于 -10^4 和 10^4 之间。
 * 树中的所有值 互不相同 。
 * 给定的树为二叉搜索树。
 */