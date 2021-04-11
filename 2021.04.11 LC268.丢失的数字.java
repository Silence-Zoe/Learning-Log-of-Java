/**
 * 执行用时：6 ms，在所有 Java 提交中击败了 29.43% 的用户
 * 内存消耗：38.8 MB，在所有 Java 提交中击败了 84.85% 的用户
 */
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                return i;
            }
        }
        return nums.length;
    }
}
/**
 * 给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。
 * --------------------------------------------------
 * 提示：
 * n == nums.length
 * 1 <= n <= 10^4
 * 0 <= nums[i] <= n
 * nums 中的所有数字都 独一无二
 */