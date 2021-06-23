/**
 * 执行用时：2 ms，在所有 Java 提交中击败了 27.18% 的用户
 * 内存消耗：38.3 MB，在所有 Java 提交中击败了 9.62% 的用户
 */
class Solution {
    private List<Integer> s = new ArrayList<>();  
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        travel(root);
        for (int i = 1; i < s.size(); i++) {
            if (s.get(i) <= s.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    private void travel(TreeNode root) {
        if (root != null) {
            travel(root.left);
            s.add(root.val);
            travel(root.right);
        }
    }
}
/**
 * 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 * 假设一个二叉搜索树具有如下特征：
 *     节点的左子树只包含小于当前节点的数。
 *     节点的右子树只包含大于当前节点的数。
 *     所有左子树和右子树自身必须也是二叉搜索树。
 * --------------------------------------------------
 * 提示：
 * 树中节点总数在范围 [0, 10^4] 内
 * -2 ^ 31 <= Node.val <= 2^31 - 1
 */