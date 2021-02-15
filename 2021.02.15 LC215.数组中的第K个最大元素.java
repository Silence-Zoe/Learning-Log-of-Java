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