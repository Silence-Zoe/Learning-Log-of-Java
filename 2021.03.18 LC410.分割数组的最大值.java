/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 53.00% 的用户
 * 内存消耗：36.1 MB，在所有 Java 提交中击败了 51.03% 的用户
 */
class Solution {
    public int splitArray(int[] nums, int m) {
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }

        int right = 0;
        for (int x : nums) {
            right += x;
        }

        int left = nums[0];
        for (int x : nums) {
            if (x > left) {
                left = x;
            }
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            int i = 1, cnt = 1;
            int sum = nums[0];
            while (i < n) {
                sum += nums[i++];
                if (sum > mid) {
                    cnt++;
                    sum = nums[i - 1];
                }
            }

            if (cnt > m) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
/**
 * 给定一个非负整数数组 nums 和一个整数 m ，你需要将这个数组分成 m 个非空的连续子数组。
 * 设计一个算法使得这 m 个子数组各自和的最大值最小。
 * --------------------------------------------------
 * 提示：
 * 1 <= nums.length <= 1000
 * 0 <= nums[i] <= 10^6
 * 1 <= m <= min(50, nums.length)
 */