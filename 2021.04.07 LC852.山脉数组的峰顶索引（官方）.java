/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：38.9 MB，在所有 Java 提交中击败了 18.63% 的用户
 */
class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int lo = 0, hi = A.length - 1;
        while (lo < hi) {
            int mi = lo + (hi - lo) / 2;
            if (A[mi] < A[mi + 1])
                lo = mi + 1;
            else
                hi = mi;
        }
        return lo;
    }
}
/**
 * 符合下列属性的数组 arr 称为 山脉数组 ：
 *     arr.length >= 3
 *     存在 i（0 < i < arr.length - 1）使得：
 *         arr[0] < arr[1] < ... arr[i-1] < arr[i]
 *         arr[i] > arr[i+1] > ... > arr[arr.length - 1]
 * 给你由整数组成的山脉数组 arr ，返回任何满足 arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1] 的下标 i 。
 * --------------------------------------------------
 * 提示：
 * 3 <= arr.length <= 104
 * 0 <= arr[i] <= 106
 * 题目数据保证 arr 是一个山脉数组
 */