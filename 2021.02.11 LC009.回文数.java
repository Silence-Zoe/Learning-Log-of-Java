/**
 * 执行用时：8 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：37.8 MB，在所有 Java 提交中击败了 66.16% 的用户
 */
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int y = x;
        int rev = y % 10;
        while ((y = y / 10) != 0) {
            rev = rev * 10 + y % 10;
        }
        if (rev == x) {
            return true;
        }
        return false;
    }
}
/**
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。
 * --------------------------------------------------
 * 提示：
 * -2^31 <= x <= 2^31 - 1
 */