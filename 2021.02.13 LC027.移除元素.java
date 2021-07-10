/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：36.7 MB，在所有 Java 提交中击败了 99.16% 的用户
 */
class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int left = 0, ans = 0;
        int right = nums.length - 1;
        while (nums[right] == val) {
            right--;
            ans++;
            if (ans == nums.length) {
                return 0;
            }
        }
        for (; left < right; left++) {
            if (nums[left] == val) {
                int t = nums[left];
                nums[left] = nums[right];
                nums[right] = t;
                while (nums[right] == val && right > 0) {
                    right--;
                    ans++;
                }
            }
        }
        return nums.length - ans;
    }
}
/**
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * --------------------------------------------------
 * 提示：
 * 0 <= nums.length <= 100
 * 0 <= nums[i] <= 50
 * 0 <= val <= 100
 */