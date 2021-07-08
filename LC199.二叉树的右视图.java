/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 99.62% 的用户
 * 内存消耗：37 MB，在所有 Java 提交中击败了 71.01% 的用户
 */
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        Deque<TreeNode> q = new LinkedList<>();

        if (root == null) {
            return ret;
        }
        
        q.offer(root);
        while(!q.isEmpty()) {
            int size = q.size();
            int i;
            for (i = 0; i < size; i++) {
                TreeNode t = q.poll();
                
                if (t.left != null) {
                    q.offer(t.left);
                }                
                if (t.right != null) {
                    q.offer(t.right);
                }

                if (i == size - 1) {
                    ret.add(t.val);
                }
            }
        }

        return ret;
    }
}
/**
 * 给定一棵二叉树，想象自己站在它的右侧，按照从顶部到底部的顺序，返回从右侧所能看到的节点值。
 * --------------------------------------------------
 * 提示：
 * 两棵树上的节点数目都在范围  [0, 100] 内
 * -100 <= Node.val <= 100
*/
