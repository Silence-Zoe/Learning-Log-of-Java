/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：42 MB，在所有 Java 提交中击败了 5.07% 的用户
 */
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int n = nums.length;
        
        if (n == 0) {
            return ans;
        }

        if (n == 1) {
            if (target != nums[0]) {
                return ans;
            } else {
                return new int[]{0, 0};
            }
        }
        
        int left = 0, right = n - 1;
        while (left + 1 < right) {
            int m = left + (right - left) / 2;
            if (nums[m] >= target) {
                right = m;
            } else {
                left = m;
            }
        }

        if (nums[left] == target) {
            ans[0] = left;
        } else if (nums[right] == target) {
            ans[0] = right;
        } else {
            return ans;
        }

        left = 0;
        right = n - 1;
        while (left + 1 < right) {
            int m = left + (right - left) / 2;
            if (nums[m] <= target) {
                left = m;
            } else {
                right = m;
            }
        }

        if (nums[right] == target) {
            ans[1] = right;
        } else if (nums[left] == target) {
            ans[1] = left;
        } 
        return ans;
    }
}
/**
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 * --------------------------------------------------
 * 提示：
 * nums 是一个非递减数组
 * 0 <= nums.length <= 10^5
 * -10^9 <= nums[i] <= 10^9
 * -10^9 <= target <= 10^9
 */
