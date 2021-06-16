/**
 * 执行用时：3 ms，在所有 Java 提交中击败了 70.29% 的用户
 * 内存消耗：40.3 MB，在所有 Java 提交中击败了 69.67% 的用户
 */
class Solution {
    private List<Double> ret = new ArrayList<>();
    public List<Double> averageOfLevels(TreeNode root) {
        if (root == null) {
            return ret;    
        } 

        Deque<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            double sum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode t = q.poll();
                sum += t.val;
                
                if (t.left != null) {
                    q.offer(t.left);
                }

                if (t.right != null) {
                    q.offer(t.right);
                }
            }
            ret.add(sum / size);
        }
        return ret;
    }
}
/**
 * 给定一个非空二叉树, 返回一个由每层节点平均值组成的数组。
 * --------------------------------------------------
 * 提示：
 * 树中节点的数目范围是 [1, 10^4]
 * 节点值的范围在32位有符号整数范围内。
 */