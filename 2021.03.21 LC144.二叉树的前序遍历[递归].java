/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：36.7 MB，在所有 Java 提交中击败了 59.10% 的用户
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<Integer>();
        preorder(root, ans);
        return ans;
    }
    public void preorder(TreeNode root, List<Integer> ans){
        if (root != null) {
            ans.add(root.val);
            preorder(root.left, ans);
            preorder(root.right, ans);
        }
        return;
    }
}
/**
 * 给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
 * --------------------------------------------------
 * 提示：
 * 树中节点数目在范围 [0, 100] 内
 * -100 <= Node.val <= 100
 */