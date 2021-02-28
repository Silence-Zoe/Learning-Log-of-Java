/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：35.4 MB，在所有 Java 提交中击败了 77.79% 的用户
 */
class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int l = 0, r = x;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (m == x / m || m < x / m && (m + 1) > x / (m + 1)) {
                return m;
            } else if (m < x / m) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }        
}
/**
 * 实现 int sqrt(int x) 函数。
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 */