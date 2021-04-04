/**
 * 执行用时：2 ms，在所有 Java 提交中击败了 98.19% 的用户
 * 内存消耗：38.6 MB，在所有 Java 提交中击败了 47.39% 的用户
 */
class Solution {
    int preIdx;
    int[] preorder;
    int[] inorder;
    Map<Integer, Integer> idxMap = new HashMap<Integer, Integer>();

    public TreeNode helper(int left, int right) {
        if (left > right) {
            return null;
        }

        int val = preorder[preIdx];
        TreeNode root = new TreeNode(val);

        int index = idxMap.get(val);

        preIdx++;

        root.left = helper(left, index - 1);
        root.right = helper(index + 1, right);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        this.inorder = inorder;
 
        preIdx = 0;

        int idx = 0;
        for (Integer val : inorder) {
            idxMap.put(val, idx++);
        }
        
        return helper(0, inorder.length - 1);
    }
}
/**
 * 根据一棵树的前序遍历与中序遍历构造二叉树。
 * 你可以假设树中没有重复的元素。
 */