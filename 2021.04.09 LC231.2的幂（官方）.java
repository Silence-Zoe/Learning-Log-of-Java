/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：35.6 MB，在所有 Java 提交中击败了 40.85% 的用户
 */
class Solution {
  public boolean isPowerOfTwo(int n) {
    if (n == 0) return false;
    long x = (long) n;
    return (x & (-x)) == x;
  }
}
/**
 * 给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
 */