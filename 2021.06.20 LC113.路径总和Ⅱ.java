/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：38.9 MB，在所有 Java 提交中击败了 26.51% 的用户
 */
class Solution {
    private List<Integer> path = new ArrayList<>();
    private List<List<Integer>> ret = new ArrayList<>();
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return ret;
        }

        travel(root, targetSum - root.val);
        return ret;
    }

    private void travel(TreeNode root, int targetSum) {
        path.add(root.val);
        if (root.left == null && root.right == null) {
            if (targetSum == 0) {
                ret.add(new ArrayList(path));
            }
            return;
        }

        
        if (root.left != null) {
            travel(root.left, targetSum - root.left.val);
            path.remove(path.size() - 1);
        }

        if (root.right != null) {
            travel(root.right, targetSum - root.right.val);
            path.remove(path.size() - 1);
        }
    }
}
/**
 * 给你二叉树的根节点 root 和一个整数目标和 targetSum ，找出所有 从根节点到叶子节点 路径总和等于给定目标和的路径。
 * --------------------------------------------------
 * 提示：
 * 树中节点总数在范围 [0, 5000] 内
 * -1000 <= Node.val <= 1000
 * -1000 <= targetSum <= 1000
 */