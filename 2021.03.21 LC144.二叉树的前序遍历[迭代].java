/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 47.41% 的用户
 * 内存消耗：36.9 MB，在所有 Java 提交中击败了 17.31% 的用户
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode p = root;
        while (p != null || !st.empty()) {
            while (p != null) {
                ans.add(p.val);
                st.push(p);
                p = p.left;
            }
            p = st.pop().right;
        }   
        return ans;
    }
}
/**
 * 给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
 * --------------------------------------------------
 * 提示：
 * 树中节点数目在范围 [0, 100] 内
 * -100 <= Node.val <= 100
 */