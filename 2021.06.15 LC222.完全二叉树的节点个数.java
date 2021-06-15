/**
 * 执行用时：6 ms，在所有 Java 提交中击败了 8.07% 的用户
 * 内存消耗：41.4 MB，在所有 Java 提交中击败了 5.09% 的用户
 */
class Solution {
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Deque<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int n = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode t = q.poll();
                n++;
                if (t.left != null) {
                    q.offer(t.left);
                }

                if (t.right != null) {
                    q.offer(t.right);
                }
            }
        }

        return n;
    }
}
/**
 * 给你一棵 完全二叉树 的根节点 root ，求出该树的节点个数。
 * --------------------------------------------------
 * 提示：
 * 树中节点的数目范围是 [0, 5 * 10^4]
 * 0 <= Node.val <= 5 * 10^4
 * 题目数据保证输入的树是 完全二叉树
*/