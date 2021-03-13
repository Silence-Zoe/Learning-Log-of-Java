/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：38.5 MB，在所有 Java 提交中击败了 86.50% 的用户
 */
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int len = nums1.length >= nums2.length ? nums1.length : nums2.length; 
        int[] ans = new int[len];
        int p1 = 0, p2 = 0;
        int cnt = 0;
        while (p1 < nums1.length && p2 < nums2.length) {
            while (nums1[p1] == nums2[p2]){
                ans[cnt++] = nums1[p1];
                p1++;
                p2++; 
                if (p1 > nums1.length - 1 || p2 > nums2.length - 1) {
                    return Arrays.copyOfRange(ans, 0, cnt);
                }
            } 
            if (nums1[p1] < nums2[p2]) {
                p1++;
            } else {
                p2++;
            }
        }
        return Arrays.copyOfRange(ans, 0, cnt);
    }
}
/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 * --------------------------------------------------
 * 提示：
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现次数的最小值一致。
 * 我们可以不考虑输出结果的顺序。
 */