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