/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：38.2 MB，在所有 Java 提交中击败了 46.60% 的用户
 */
class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if (n == 1 || nums[0] > nums[1]) {
            return 0;
        }
        if (nums[n - 1] > nums[n - 2]) {
            return n - 1;
        }
        int left = 0, right = n - 1;
        while (left < right) {
            int m = left + (right - left) / 2;
            if (nums[m] > nums[m - 1] && nums[m] > nums[m + 1]) {
                return m;
            } else if (nums[m + 1] > nums[m]) {
                left = m + 1;
            } else {
                right = m;
            }
        }
        return left;
    }
}
/**
 * 峰值元素是指其值大于左右相邻值的元素。
 * 给你一个输入数组 nums，找到峰值元素并返回其索引。数组可能包含多个峰值，在这种情况下，返回 任何一个峰值 所在位置即可。
 * 你可以假设 nums[-1] = nums[n] = -∞ 。
 * --------------------------------------------------
 * 提示：
 * 1 <= nums.length <= 1000
 * -2^31 <= nums[i] <= 2^31 - 1
 * 对于所有有效的 i 都有 nums[i] != nums[i + 1]
 */