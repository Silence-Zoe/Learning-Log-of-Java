/**
 * 执行用时：32 ms，在所有 Java 提交中击败了 17.13% 的用户
 * 内存消耗：43.3 MB，在所有 Java 提交中击败了 62.39% 的用户
 */
class Solution {
    Map<String, Integer> count;
    List<TreeNode> ans;
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        count = new HashMap();
        ans = new ArrayList();
        collect(root);
        return ans;
    }

    public String collect(TreeNode node) {
        if (node == null) return "#";
        String serial = node.val + "," + collect(node.left) + "," + collect(node.right);
        count.put(serial, count.getOrDefault(serial, 0) + 1);
        if (count.get(serial) == 2)
            ans.add(node);
        return serial;
    }
}
/**
 * 给定一棵二叉树，返回所有重复的子树。对于同一类的重复子树，你只需要返回其中任意一棵的根结点即可。
 * 两棵树重复是指它们具有相同的结构以及相同的结点值。
 */