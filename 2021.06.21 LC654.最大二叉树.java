/**
 * 执行用时：4 ms，在所有 Java 提交中击败了 15.82% 的用户
 * 内存消耗：38.7 MB，在所有 Java 提交中击败了 35.07% 的用户
 */
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        int len = nums.length;
        int ind = getMax(nums);
        
        TreeNode left = constructMaximumBinaryTree(Arrays.copyOfRange(nums, 0, ind));
        if (ind == len - 1) {
            TreeNode right = null;
        }
        TreeNode right = constructMaximumBinaryTree(Arrays.copyOfRange(nums, ind + 1, len));
        TreeNode root = new TreeNode(nums[ind], left, right);
                  
        return root;
    }

    private int getMax(int nums[]) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            max = nums[max] > nums[i] ? max : i; 
        }
        return max;
    }
}
/**
 * 给定一个不含重复元素的整数数组 nums 。一个以此数组直接递归构建的 最大二叉树 定义如下：
 *     二叉树的根是数组 nums 中的最大元素。
 *     左子树是通过数组中 最大值左边部分 递归构造出的最大二叉树。
 *     右子树是通过数组中 最大值右边部分 递归构造出的最大二叉树。
 * 返回有给定数组 nums 构建的 最大二叉树 。
 * --------------------------------------------------
 * 提示：
 * 1 <= nums.length <= 1000
 * 0 <= nums[i] <= 1000
 * nums 中的所有整数 互不相同
 */