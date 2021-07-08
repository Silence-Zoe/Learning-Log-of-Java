/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：35.6 MB，在所有 Java 提交中击败了 93.49% 的用户
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }

    private void invert(TreeNode root) {
        if (root == null) {
            return;
        }

        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;

        invert(root.left);
        invert(root.right);
    }
}
/**
 * 翻转一棵二叉树。
 * --------------------------------------------------
 * 提示：
 * 两棵树上的节点数目都在范围  [0, 100] 内
 * -100 <= Node.val <= 100
*/
