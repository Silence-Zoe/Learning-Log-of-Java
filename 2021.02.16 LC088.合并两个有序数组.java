/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：38.3 MB，在所有 Java 提交中击败了 92.34% 的用户
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = nums1.length - nums2.length - 1, q = nums2.length - 1;
        for (int i = nums1.length - 1; i >= 0; i--) {
            if (nums2.length == 0) {
                return;
            }
            if (nums1.length == nums2.length) {
                for (int j = 0; j < nums1.length; j++) {
                    nums1[j] = nums2[j];
                }
            }
            if (p >= 0 && q >= 0) {
                nums1[i] = nums1[p] > nums2[q] ? nums1[p--] : nums2[q--];
            } else {
                nums1[i] = p == -1 ? nums2[q--] : nums1[p--];
            }
        }
    }
}
/**
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。你可以假设 nums1 的空间大小等于 m + n，这样它就有足够的空间保存来自 nums2 的元素。
 */