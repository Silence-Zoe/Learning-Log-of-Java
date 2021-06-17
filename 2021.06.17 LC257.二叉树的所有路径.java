/**
 * 执行用时：3 ms，在所有 Java 提交中击败了 54.29% 的用户
 * 内存消耗：38.6 MB，在所有 Java 提交中击败了 55.59% 的用户
 */
class Solution {
    private List<String> ret = new ArrayList<>();
    private String ar = new String("->");

    public List<String> binaryTreePaths(TreeNode root) {
        StringBuilder str = new StringBuilder();
        travel(str, root);
        return ret;
    }

    private void travel(StringBuilder str, TreeNode root) {
        str.append(root.val);
        
        if (root.left == null && root.right == null) {
            ret.add(str.toString());
            return;
        }

        
        if (root.left != null) {
            travel(new StringBuilder(str).append(ar), root.left);
        }
        
        if (root.right != null) {
            travel(new StringBuilder(str).append(ar), root.right);
        }
    }
}
/**
 * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 * --------------------------------------------------
 * 提示：
 * 树中的节点数在范围 [1, 100] 内
 * -100 <= Node.val <= 100
 */