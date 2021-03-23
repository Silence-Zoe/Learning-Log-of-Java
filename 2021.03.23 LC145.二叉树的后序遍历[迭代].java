/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 54.01% 的用户
 * 内存消耗：36.7 MB，在所有 Java 提交中击败了 62.08% 的用户
 */
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Deque<TreeNode> st = new LinkedList<>();
        TreeNode p = root;
        TreeNode pre = null;
        while (!st.isEmpty() || p != null) {
            while (p != null) {
                st.push(p);
                p = p.left;
            }
            p = st.pop();
            if (p.right != null && p.right != pre) {
                pre = p;
                st.push(p);
                p = p.right;
            } else {
                ans.add(p.val);
                pre = p;
                p = null;
            } 
        }
        return ans;
    }
}
/**
 * 给定一个二叉树 ，返回它的 后序 遍历。
 * --------------------------------------------------
 * 提示：
 * 树中节点数目在范围 [0, 100] 内
 * -100 <= Node.val <= 100
 */