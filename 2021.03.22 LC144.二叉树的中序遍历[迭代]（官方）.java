/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 42.30% 的用户
 * 内存消耗：36.4 MB，在所有 Java 提交中击败了 96.51% 的用户
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Deque<TreeNode> stk = new LinkedList<TreeNode>();
        while (root != null || !stk.isEmpty()) {
            while (root != null) {
                stk.push(root);
                root = root.left;
            }
            root = stk.pop();
            res.add(root.val);
            root = root.right;
        }
        return res;
    }
}
/**
 * 给定一个二叉树的根节点 root ，返回它的 中序 遍历。
 * --------------------------------------------------
 * 提示：
 * 树中节点数目在范围 [0, 100] 内
 * -100 <= Node.val <= 100
 */