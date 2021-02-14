/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 79.64% 的用户
 * 内存消耗：40.1 MB，在所有 Java 提交中击败了 84.20% 的用户
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}