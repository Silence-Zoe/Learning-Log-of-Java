/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：35.9 MB，在所有 Java 提交中击败了 46.09% 的用户
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
/**
 * 翻转一棵二叉树。
 * --------------------------------------------------
 * 提示：
 * 两棵树上的节点数目都在范围  [0, 100] 内
 * -100 <= Node.val <= 100
*/
