/**
 * 执行用时：2 ms，在所有 Java 提交中击败了 84.59% 的用户
 * 内存消耗：38.8 MB，在所有 Java 提交中击败了 24.92% 的用户
 */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        Deque<TreeNode> q = new LinkedList<>();

        if (root == null) {
            return ret;
        }

        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < size; i++) {
                TreeNode t = q.poll();
                max = Math.max(max, t.val);
                if (t.left != null) {
                    q.offer(t.left);
                }
                if (t.right != null) {
                    q.offer(t.right);
                }
            }
            ret.add(max);
        }
        return ret;
    }
}
/**
 * 您需要在二叉树的每一行中找到最大的值。
 * --------------------------------------------------
 * 提示：
 * 树中节点的数目范围是 [0, 10^4]
 * 节点值的范围在32位有符号整数范围内。
 */