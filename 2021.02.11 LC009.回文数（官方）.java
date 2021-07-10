/**
 * 执行用时：9 ms，在所有 Java 提交中击败了 97.44% 的用户
 * 内存消耗：37.5 MB，在所有 Java 提交中击败了 96.05% 的用户
 */
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber / 10;
    }
}
/**
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。
 * --------------------------------------------------
 * 提示：
 * -2^31 <= x <= 2^31 - 1
 */