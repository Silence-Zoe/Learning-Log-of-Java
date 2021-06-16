/**
 * 执行用时：2 ms，在所有 Java 提交中击败了 99.29% 的用户
 * 内存消耗：40.3 MB，在所有 Java 提交中击败了 68.80% 的用户
 */

class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> averages = new ArrayList<Double>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            double sum = 0;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                TreeNode left = node.left, right = node.right;
                if (left != null) {
                    queue.offer(left);
                }
                if (right != null) {
                    queue.offer(right);
                }
            }
            averages.add(sum / size);
        }
        return averages;
    }
}
/**
 * 给定一个非空二叉树, 返回一个由每层节点平均值组成的数组。
 * --------------------------------------------------
 * 提示：
 * 树中节点的数目范围是 [1, 10^4]
 * 节点值的范围在32位有符号整数范围内。
 */