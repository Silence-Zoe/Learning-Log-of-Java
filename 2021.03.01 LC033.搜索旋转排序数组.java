/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：37.9 MB，在所有 Java 提交中击败了 39.83% 的用户
 */
class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] == target) {
                return m;
            } else if (nums[l] <= nums[r]) {
                if (target < nums[m]) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            } else if (nums[l] <= nums[m]) {
                if (target >= nums[l] && target < nums[m]) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            } else if (nums[r] >= nums[m]) {
                if (target <= nums[r] && target > nums[m]) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
        }
        return -1;
    }
}
/**
 * 整数数组 nums 按升序排列，数组中的值 互不相同 。
 * 在传递给函数之前，nums 在预先未知的某个下标 k（0 <= k < nums.length）上进行了 旋转，使数组变为 [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]（下标 从 0 开始 计数）。例如， [0,1,2,4,5,6,7] 在下标 3 处经旋转后可能变为 [4,5,6,7,0,1,2] 。
 * 给你 旋转后 的数组 nums 和一个整数 target ，如果 nums 中存在这个目标值 target ，则返回它的索引，否则返回 -1 。
 * --------------------------------------------------
 * 提示：
 * nums 中的每个值都 独一无二
 * nums 肯定会在某个点上旋转
 * 1 <= nums.length <= 5000
 * -10^4 <= nums[i] <= 10^4
 * -10^4 <= target <= 10^4
 */