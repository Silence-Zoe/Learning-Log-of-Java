/**
 * 执行用时：1954 ms，在所有 Java 提交中击败了 5.32% 的用户
 * 内存消耗：41.8 MB，在所有 Java 提交中击败了 72.06% 的用户
 */
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == goal) {
                    ret++;
                } else if (sum > goal) {
                    break;
                }
            }
        }
        return ret;
    }
}
/**
 * 
 * 给你一个二元数组 nums ，和一个整数 goal ，请你统计并返回有多少个和为 goal 的 非空 子数组。
 * 子数组 是数组的一段连续部分。
 * --------------------------------------------------
 * 提示：
 * 1 <= nums.length <= 3 * 10^4
 * nums[i] 不是 0 就是 1
 * 0 <= goal <= nums.length
 */