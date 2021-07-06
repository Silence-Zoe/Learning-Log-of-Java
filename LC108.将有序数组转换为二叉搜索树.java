/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：38.4 MB，在所有 Java 提交中击败了 9.49% 的用户
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int l = nums.length;
        if (l == 0) {
            return null;
        }
        TreeNode root = new TreeNode(nums[l / 2]);
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, l / 2));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums, l / 2 + 1, l));
        return root;
    }
}
/**
 * 给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 高度平衡 二叉搜索树。
 * 高度平衡 二叉树是一棵满足「每个节点的左右两个子树的高度差的绝对值不超过 1 」的二叉树。
 * --------------------------------------------------
 * 提示：
 * 1 <= nums.length <= 10^4
 * -10^4 <= nums[i] <= 10^4
 * nums 按 严格递增 顺序排列
 */