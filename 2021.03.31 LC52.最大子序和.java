/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 94.72% 的用户
 * 内存消耗：38.4 MB，在所有 Java 提交中击败了 49.46% 的用户
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        boolean flag = true;
        for (int i = 1; i < nums.length; i++) {
            ans = Math.max(ans, nums[i]);
            if (nums[i] > 0) {
                flag = false;
            }
        }
        if (flag) {
            return ans;
        }
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum < 0) {
                sum = 0;    
            } else {
                ans = Math.max(ans, sum);
            }
        }
        return ans;
    }
}
/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 * --------------------------------------------------
 * 提示：
 * 1 <= nums.length <= 3 * 10^4
 * -10^5 <= nums[i] <= 10^5
 */