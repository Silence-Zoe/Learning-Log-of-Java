/**
 * 执行用时：4 ms，在所有 Java 提交中击败了 23.00% 的用户
 * 内存消耗：39.6 MB，在所有 Java 提交中击败了 71.46% 的用户
 */
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int n = n1 + n2;
        int[] nums = new int[n];
        System.arraycopy(nums1, 0, nums, 0, n1);
        System.arraycopy(nums2, 0, nums, n1, n2);
        Arrays.sort(nums);
        return n % 2 == 1 ? nums[n / 2]  : (nums[n / 2] + nums[n / 2 - 1]) / 2.0;
    }
}
/**
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
 * --------------------------------------------------
 * 提示：
 * nums1.length == m
 * nums2.length == n
 * 0 <= m <= 1000
 * 0 <= n <= 1000
 * 1 <= m + n <= 2000
 * -10^6 <= nums1[i], nums2[i] <= 10^6
 */
