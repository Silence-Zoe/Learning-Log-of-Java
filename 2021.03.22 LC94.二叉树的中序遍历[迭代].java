/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：36.7 MB，在所有 Java 提交中击败了 46.13% 的用户
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Deque<TreeNode> st = new LinkedList<>();
        TreeNode p = root;
        while (!st.isEmpty() || p != null) {
            while (p != null) {
                st.push(p);
                p = p.left;
            }
            p = st.pop();
            ans.add(p.val);
            p = p.right;
        }

        return ans;
    }
}
/**
 * 给定一个二叉树的根节点 root ，返回它的 中序 遍历。
 * --------------------------------------------------
 * 提示：
 * 树中节点数目在范围 [0, 100] 内
 * -100 <= Node.val <= 100
 */
