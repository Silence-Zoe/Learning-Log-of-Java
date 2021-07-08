/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 99.29% 的用户
 * 内存消耗：38.5 MB，在所有 Java 提交中击败了 73.11% 的用户
 */
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> lay = new ArrayList<>();
        Deque<TreeNode> q = new LinkedList<>();

        if (root == null) {
            return ans;
        }

        q.offer(root);
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode t = q.poll();
                lay.add(t.val);
                if (t.left != null) {
                    q.offer(t.left);
                }
                
                if(t.right != null) {
                    q.offer(t.right);
                }
            }
            ans.add(new ArrayList(lay));
            lay.clear();
        }

        Collections.reverse(ans);
        return ans;
    }
}
/**
 * 给定一个二叉树，返回其节点值自底向上的层序遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 * --------------------------------------------------
 * 提示：
 * 树中节点数目在范围 [0, 2000] 内
 * -1000 <= Node.val <= 1000 
*/
