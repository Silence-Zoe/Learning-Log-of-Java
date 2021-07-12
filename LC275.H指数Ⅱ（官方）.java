/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：45.4 MB，在所有 Java 提交中击败了 32.48% 的用户
 */
class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (citations[mid] >= n - mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return n - left;
    }
}
/**
 * 给定一位研究者论文被引用次数的数组（被引用次数是非负整数）。编写一个方法，计算出研究者的 h 指数。
 * h 指数的定义：h 代表“高引用次数”（high citations），一名科研人员的 h 指数是指他（她）的 （N 篇论文中）总共有 h 篇论文分别被引用了至少 h 次。且其余的 N - h 篇论文每篇被引用次数 不超过 h 次。
 * --------------------------------------------------
 * 提示：
 * 如果 h 有多种可能的值，h 指数是其中最大的那个。
 * 1 <= citations.length <= 10^5
 * 0 <= citations[i] <= 1000
 */