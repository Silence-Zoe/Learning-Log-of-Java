/**
 * 执行用时：312 ms，在所有 Java 提交中击败了 5.04% 的用户
 * 内存消耗：38.6 MB，在所有 Java 提交中击败了 23.19% 的用户
 */
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans = nums.length;
        int l = 0, r = nums.length - 1;
        if (sum(nums, l, r) < target) {
            return 0;
        }
        if (sum(nums, l, r) == target) {
            return ans;
        }
        r = l;
        while (r < nums.length) {
            if (sum(nums, l, r) >= target) {
                while (sum(nums, l + 1, r) >= target) {
                    l++;
                }
                ans = Math.min(ans, r - l + 1);
            }
            r++;
        }
        return ans;
    }
    public int sum(int[] nums, int l, int r) {
        int n = 0;
        for (int i = l; i <= r; i++) {
            n += nums[i];
        }
        return n;
    }
}
/**
 * 给定一个含有 n 个正整数的数组和一个正整数 target 。
 * 找出该数组中满足其和 ≥ target 的长度最小的 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
 * --------------------------------------------------
 * 提示：
 * 1 <= target <= 109
 * 1 <= nums.length <= 105
 * 1 <= nums[i] <= 105
 */