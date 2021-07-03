/**
 * 执行用时：2 ms，在所有 Java 提交中击败了 64.84% 的用户
 * 内存消耗：37.9 MB，在所有 Java 提交中击败了 83.64% 的用户
 */
class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Deque<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        int last = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            last = q.peek().val;
            for (int i = 0; i < size; i++) {
                TreeNode t = q.poll();
                if (t.left != null) {
                    q.offer(t.left);
                }
                if (t.right != null) {
                    q.offer(t.right);
                }
            }
        }
        return last;
    }
}
/**
 * 给定一个二叉树，在树的最后一行找到最左边的值。
 * --------------------------------------------------
 * 提示：
 * 树中的节点数在范围 [1, 10^4] 内
 * -2^31 <= Node.val <= 2^31 - 1
 */
