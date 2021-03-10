/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：38.6 MB，在所有 Java 提交中击败了 5.16% 的用户
 */
class Solution {
    public int findMin(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int m = left + (right - left) / 2;
            if (nums[right] == nums[left]) {
                right--;
            } else if (nums[left] <= nums[m] && nums[left] >= nums[right]){
                left = m + 1;
            } else {
                right = m;
            }
        }
        return nums[left];
    }
}
/**
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 * 请找出其中最小的元素。
 * 注意数组中可能存在重复的元素。
 * --------------------------------------------------
 * 提示：
 * nums 原来是一个升序排序的数组，但在预先未知的某个点上进行了旋转
 * -5000 <= nums[i] <= 5000
 * 1 <= nums.length <= 5000
 */