/**
 * 执行用时：174 ms，在所有 Java 提交中击败了 5.12% 的用户
 * 内存消耗：38.6 MB，在所有 Java 提交中击败了 79.25% 的用户
 */
class Solution {
    public int findKthLargest(int[] nums, int k) {
        if (nums.length == 1) {
            return nums[0];
        }
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            cnt = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j == i) {
                    continue;
                }
                if (nums[i] <= nums[j]) {
                    cnt++;
                }
            }
            if (cnt == k) {
                return nums[i];
            }
        }
        return nums[1];
    }
}
/**
 * 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 * --------------------------------------------------
 * 提示：
 * 你可以假设 k 总是有效的，且 1 ≤ k ≤ 数组的长度。
 */