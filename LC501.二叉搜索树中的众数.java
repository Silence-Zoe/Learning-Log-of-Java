/**
 * 执行用时：9 ms，在所有 Java 提交中击败了 9.93% 的用户
 * 内存消耗：40.1 MB，在所有 Java 提交中击败了 15.93% 的用户
 */
class Solution {
    private Map<Integer, Integer> hm = new HashMap<>();
    public int[] findMode(TreeNode root) {
        dfs(root);
        
        List<Integer> ans = new ArrayList<>();
        int max = 0;

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            max = Math.max(max, entry.getValue());
        }

        for (Map.Entry<Integer, Integer> entry: hm.entrySet()) {
            if (max == entry.getValue()) {
                ans.add(entry.getKey());
            }
        }
        return ans.stream().mapToInt(Integer::valueOf).toArray();
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        hm.put(root.val, hm.getOrDefault(root.val, 0) + 1);
        dfs(root.right);
    }
}
/**
 * 给定一个有相同值的二叉搜索树（BST），找出 BST 中的所有众数（出现频率最高的元素）。
 * 假定 BST 有如下定义：
 *     结点左子树中所含结点的值小于等于当前结点的值
 *     结点右子树中所含结点的值大于等于当前结点的值
 *     左子树和右子树都是二叉搜索树
 * --------------------------------------------------
 * 提示：
 * 树中节点总数在范围 [1, 10^4] 内
 * -10^5 <= Node.val <= 10^5
 */
