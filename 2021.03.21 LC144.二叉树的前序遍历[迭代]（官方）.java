/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 47.41% 的用户
 * 内存消耗：36.5 MB，在所有 Java 提交中击败了 87.12% 的用户
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }

        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        TreeNode node = root;
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                res.add(node.val);
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            node = node.right;
        }
        return res;
    }
}
/**
 * 给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
 * --------------------------------------------------
 * 提示：
 * 树中节点数目在范围 [0, 100] 内
 * -100 <= Node.val <= 100
 */