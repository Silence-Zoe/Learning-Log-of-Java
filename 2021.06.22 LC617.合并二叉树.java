/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 42.37% 的用户
 * 内存消耗：38.8 MB，在所有 Java 提交中击败了 53.20% 的用户
 */
class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        TreeNode root = new TreeNode();
        if (root1 == null && root2 == null) {
            return null;
        }

        if (root1 == null) {
            return root2;
        }

        if (root2 == null) {
            return root1;
        }

        root.val = root1.val + root2.val;
        root.left = mergeTrees(root1.left, root2.left);
        root.right = mergeTrees(root1.right, root2.right);
        return root;
    }
}
/**
 * 给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。
 * 你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则不为 NULL 的节点将直接作为新二叉树的节点。
 * --------------------------------------------------
 * 提示：
 * 合并必须从两个树的根节点开始。
 * 树中节点总数在范围 [0, 2000] 内
 * -10^4 <= Node.val <= 10^4
 */