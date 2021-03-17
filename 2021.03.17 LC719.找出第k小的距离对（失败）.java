/**
 * 执行用时：## ms，在所有 Java 提交中击败了 ##% 的用户
 * 内存消耗：## MB，在所有 Java 提交中击败了 ##% 的用户
 */
class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0, right = nums[nums.length - 1] - nums[0];
        int p1 = 0, p2 = 1;
        while (left <= right) {
            int m = left + (right - left) / 2;
            while (nums[p2] - nums[p1] <= m) {
                k--;
                if (k == 0) {
                    return nums[p2] - nums[p1];
                }
                if (p2 - p1 <= 1) {
                    p2++;
                } else if (p2 != nums.length - 1 && nums[p2 + 1] - nums[p1] <=  nums[p2] - nums[p1 + 1]) {
                    p2++;
                } else {
                    p1++;
                }
            }
            left = m + 1;
        }
        return -1;
    }
}
/**
 * 给定一个整数数组，返回所有数对之间的第 k 个最小距离。一对 (A, B) 的距离被定义为 A 和 B 之间的绝对差值。
 * --------------------------------------------------
 * 提示：
 * 2 <= len(nums) <= 10000.
 * 0 <= nums[i] < 1000000.
 * 1 <= k <= len(nums) * (len(nums) - 1) / 2.
 */