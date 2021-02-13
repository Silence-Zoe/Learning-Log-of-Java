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