/**
 * 执行用时：3 ms，在所有 Java 提交中击败了 54.94% 的用户
 * 内存消耗：37.9 MB，在所有 Java 提交中击败了 99.56% 的用户
 */
class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int m = left + (right - left) / 2;
            if (nums[m] == nums[m + 1]) {
                return nums[m];
            } else if (nums[m] < m + 1) {
                right = m - 1;
            } else {
                left = m + 1;
            }
        }
        return -1;
    }
}
/**
 * 给定一个包含 n + 1 个整数的数组 nums ，其数字都在 1 到 n 之间（包括 1 和 n），可知至少存在一个重复的整数。
 * 假设 nums 只有 一个重复的整数 ，找出 这个重复的数 。
 * --------------------------------------------------
 * 提示：
 * nums 中 只有一个整数 出现 两次或多次 ，其余整数均只出现 一次
 * 2 <= n <= 3 * 104
 * nums.length == n + 1
 * 1 <= nums[i] <= n
 */