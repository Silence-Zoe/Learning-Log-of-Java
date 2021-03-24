/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 94.65% 的用户
 * 内存消耗：38.8 MB，在所有 Java 提交中击败了 24.40% 的用户
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Deque<TreeNode> queue = new LinkedList<>();
        TreeNode p = root;
        if (p == null) {
            return ans;
        }
        queue.addLast(p);
        while (!queue.isEmpty()) {
            List<Integer> tmp = new ArrayList<>();
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                p = queue.removeFirst();
                tmp.add(p.val);
                if (p.left != null) {
                    queue.addLast(p.left);
                }
                if (p.right != null) {
                    queue.addLast(p.right);
                }
            }
            ans.add(tmp);
        }
        return ans;
    }
}
/**
 * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 * --------------------------------------------------
 * 提示：
 * 树中节点数目在范围 [0, 2000] 内
 * -1000 <= Node.val <= 1000
 */