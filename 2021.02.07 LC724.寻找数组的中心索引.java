/**
 * 执行用时：474 ms，在所有 Java 提交中击败了 6.10% 的用户
 * 内存消耗：39 MB，在所有 Java 提交中击败了 81.45% 的用户
 */
class Solution {
    public int pivotIndex(int[] nums) {
        int sum1, sum2;
        for (int x = 0; x < nums.length; x++) {
            sum1 = 0;
            sum2 = 0;
            for (int i = 0; i < x; i++) {
                sum1 += nums[i];
            }
            for (int j = x + 1; j < nums.length; j++) {
                sum2 += nums[j];
            }
            if (sum1 == sum2) {
                return x;
            }
        }
        return -1;
    }
}
/**
 * 给你一个整数数组 nums，请编写一个能够返回数组 “中心下标” 的方法。
 * 数组 中心下标 是数组的一个下标，其左侧所有元素相加的和等于右侧所有元素相加的和。
 * 如果数组不存在中心下标，返回 -1 。如果数组有多个中心下标，应该返回最靠近左边的那一个。
 * --------------------------------------------------
 * 提示：
 * 中心下标可能出现在数组的两端。
 * nums 的长度范围为 [0, 10000]。
 * 任何一个 nums[i] 将会是一个范围在 [-1000, 1000]的整数。
 */