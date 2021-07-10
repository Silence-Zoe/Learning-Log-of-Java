/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 81.60% 的用户
 * 内存消耗：38.8 MB，在所有 Java 提交中击败了 14.55% 的用户
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0, j = 1, cnt = 1;
        for (; j < nums.length; j++) {
            if (nums[i] != nums[j] || nums[i] == nums[j] && (i == 0 || nums[i - 1] != nums[j])) {
                nums[++i] = nums[j];
                cnt++;
            }
        }
        return cnt;
    }
}
/**
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 最多出现两次 ，返回删除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 * --------------------------------------------------
 * 提示：
 * 1 <= nums.length <= 3 * 10^4
 * -10^4 <= nums[i] <= 10^4
 * nums 已按升序排列
 */