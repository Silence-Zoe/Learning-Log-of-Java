/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：35.2 MB，在所有 Java 提交中击败了 66.12% 的用户
 */
class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2) {
            return true;
        }

        long left = 2, right = num / 2, x, guesSquared;
        while (left <= right) {
            x = left + (right - left) / 2;
            guesSquared = x * x;
            if (guesSquared == num) {
                return true;
            }
            if (guesSquared > num) {
                right = x - 1;
            } else {
                left = x + 1;
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