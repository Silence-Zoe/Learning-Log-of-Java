/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：39.3 MB，在所有 Java 提交中击败了 61.07% 的用户
 */
class Solution {
  public TreeNode searchBST(TreeNode root, int val) {
    if (root == null || val == root.val) {
        return root;
    }
    return val < root.val ? searchBST(root.left, val) : searchBST(root.right, val);
  }
}
/**
 * 给定二叉搜索树（BST）的根节点和一个值。 你需要在BST中找到节点值等于给定值的节点。 返回以该节点为根的子树。 如果节点不存在，则返回 NULL。
 * --------------------------------------------------
 * 提示：
 * 树中节点总数在范围 [0, 5000] 内
 * 1 <= Node.val <= 10^7
 * 1 <= val <= 10^7
 */