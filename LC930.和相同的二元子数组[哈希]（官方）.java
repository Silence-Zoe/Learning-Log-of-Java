/**
 * 执行用时：21 ms，在所有 Java 提交中击败了 60.31% 的用户
 * 内存消耗：43.2 MB，在所有 Java 提交中击败了 9.98% 的用户
 */
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int sum = 0;
        Map<Integer, Integer> cnt = new HashMap<Integer, Integer>();
        int ret = 0;
        for (int num : nums) {
            cnt.put(sum, cnt.getOrDefault(sum, 0) + 1);
            sum += num;
            ret += cnt.getOrDefault(sum - goal, 0);
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