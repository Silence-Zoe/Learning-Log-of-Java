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
/**
 * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * 此题中，我们使用整数 0 、1 和 2 分别表示红色、白色和蓝色。
 * --------------------------------------------------
 * 提示：
 * n == nums.length
 * 1 <= n <= 300
 * nums[i] 为 0、1 或 2
 */