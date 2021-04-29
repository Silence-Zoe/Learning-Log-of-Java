/**
 * 执行用时：136 ms，在所有 Java 提交中击败了 5.07% 的用户
 * 内存消耗：95.6 MB，在所有 Java 提交中击败了 5.03% 的用户
 */
class Solution {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        HashMap<List<Integer>, Integer> hm = new HashMap<>();
        List<TreeNode> ans = new ArrayList<>();
        Deque<TreeNode> q = new LinkedList<>();
        if (root == null) {
            return ans;
        }
        q.offerLast(root);
        while (!q.isEmpty()) {
            for (int i = 0; i < q.size(); i++) {
                TreeNode p = q.pollFirst();
                List l = getList(p);
                if (!hm.containsKey(l)) {
                    hm.put(l, 0);
                }
                hm.put(l, hm.get(l) + 1);
                
                if (hm.get(l) == 2) {
                    ans.add(p);
                }
                if (p.left != null) {
                    q.offerLast(p.left);
                }
                if (p.right != null) {
                    q.offerLast(p.right);
                }
            }
        }
        return ans;
    }

    public List<Integer> getList(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        Deque<TreeNode> q = new LinkedList<>();
        q.offerLast(root);
        while (!q.isEmpty()) {
            for (int i = 0; i < q.size(); i++) {
                TreeNode p = q.pollFirst();
                ret.add(p.val);
                if (p.left != null) {
                    q.offerLast(p.left);
                } else {
                    ret.add(2147483647);
                }
                if (p.right != null) {
                    q.offerLast(p.right);
                } else {
                    ret.add(-2147483648);
                }
            }
        }
        return ret;
    }
}
/**
 * 给定一棵二叉树，返回所有重复的子树。对于同一类的重复子树，你只需要返回其中任意一棵的根结点即可。
 * 两棵树重复是指它们具有相同的结构以及相同的结点值。
 */