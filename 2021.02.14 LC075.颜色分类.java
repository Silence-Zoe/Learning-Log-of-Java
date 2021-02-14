/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：37 MB，在所有 Java 提交中击败了 52.71% 的用户
 */
class Solution {
    public void sortColors(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return;
        }
        int i = 0, j = 1;
        for (; j < nums.length; j++) {
            while (nums[i] == 0) {
                if (i == nums.length - 1) {
                    return;
                }
                i++;
                j++;
            }
            if (j > nums.length - 1) {
                return;
            } else if (nums[j] == 0 ) {
                swap(nums, i++, j);
            }
        } 
        for (j = i + 1; j < nums.length; j++) {
            while (nums[i] == 1) {
                if (i == nums.length - 1) {
                    return;
                }
                i++;
                j++;
            }
            if (j > nums.length - 1) {
                return;
            } else if (nums[j] == 1) {
                swap(nums, i++, j);
            }
        }
    }
    public void swap(int[] nums, int a, int b) {
        int t = nums[a];
        nums[a] = nums[b];
        nums[b] = t;
    }
}