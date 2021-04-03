/**
 * 执行用时：31 ms，在所有 Java 提交中击败了 5.01% 的用户
 * 内存消耗：38.7 MB，在所有 Java 提交中击败了 26.30% 的用户
 */
class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        List<Integer> in = new ArrayList<Integer>(Arrays.stream(inorder).boxed().collect(Collectors.toList()));
        List<Integer> post = new ArrayList<Integer>(Arrays.stream(postorder).boxed().collect(Collectors.toList()));
        return build(in, post);
    }

    public TreeNode build(List<Integer> in, List<Integer> post) {
        int l = in.size();
        if (l == 0) {
            return null;
        }
        TreeNode root = new TreeNode((Integer)post.get(l - 1).intValue());
        if (l == 1) {
            return root;
        }
        int n = in.indexOf(root.val);
        root.left = build(in.subList(0, n), post.subList(0, n));
        root.right = build(in.subList(n + 1, l), post.subList(n, l - 1));
        return root;
    }
}
/**
 * 根据一棵树的中序遍历与后序遍历构造二叉树。
 * 你可以假设树中没有重复的元素。
 */