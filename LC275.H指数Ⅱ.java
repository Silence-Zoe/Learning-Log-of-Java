/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 29.19% 的用户
 * 内存消耗：44.8 MB，在所有 Java 提交中击败了 97.74% 的用户
 */
class Solution {
    public int hIndex(int[] citations) {
        int h = 0;
        for (int i = citations.length - 1; i >= 0; i--) {
            if (citations[i] > h) {
                h++;
            }
        }
        return h;
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