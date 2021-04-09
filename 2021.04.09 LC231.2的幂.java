/**
 * 执行用时：2 ms，在所有 Java 提交中击败了 7.87% 的用户
 * 内存消耗：35.5 MB，在所有 Java 提交中击败了 64.73% 的用户
 */
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        while (n % 2 == 0) {
            n /= 2;
        }
        return n == 1 ? true : false;
    }
}
/**
 * 给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
 */