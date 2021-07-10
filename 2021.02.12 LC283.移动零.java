/**
 * 执行用时：7 ms，在所有 Java 提交中击败了 8.80% 的用户
 * 内存消耗：38.8 MB，在所有 Java 提交中击败了 48.70% 的用户
 */
class Solution {
    public void moveZeroes(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length - cnt; i++) {
            while (nums[i] == 0 && cnt < nums.length) {
                int j;
                for (j = i; j < nums.length - cnt - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[j] = 0;
                cnt++;
            }
        }
    }
}
/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * --------------------------------------------------
 * 提示：
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 */