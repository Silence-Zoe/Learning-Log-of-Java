/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：34.9 MB，在所有 Java 提交中击败了 96.31% 的用户
 */
class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 0, right = num;
        while (left <= right) {
            int m = left + (right - left) / 2;
            if (m * m == num) {
                return true;
            } else if ((double)m * m < num) {
                left = m + 1;
            } else {
                right = m - 1;
            }
        }
        return false;
    }
}
/**
 * 给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
 * --------------------------------------------------
 * 提示：
 * 不要使用任何内置的库函数，如  sqrt。
 */