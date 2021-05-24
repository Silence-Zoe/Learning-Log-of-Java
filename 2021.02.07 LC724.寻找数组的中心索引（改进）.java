/**
 * 执行用时：193 ms，在所有 Java 提交中击败了 13.88% 的用户
 * 内存消耗：38.8 MB，在所有 Java 提交中击败了 93.10% 的用户
 */
class Solution {
    public int pivotIndex(int[] nums) {
        int sum1 = 0;
        int sum2;
        for (int i = 0; i < nums.length; i++) {
            sum1 += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            sum2 = 0;
            for (int j = 0; j < i; j++) {
                sum2 += nums[j];
            }
            if (sum1 - nums[i] - sum2 == sum2) {
                return i;
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