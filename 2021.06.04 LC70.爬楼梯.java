/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：35.3 MB，在所有 Java 提交中击败了 31.62% 的用户
 */
class Solution {
    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int a = 1, b = 2;
        int ret = 0;
        for (int i = 2; i < n; i++) {
            ret = a + b;
            a = b;
            b = ret;
        }
        return ret;
    }
}
/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * --------------------------------------------------
 * 提示：
 * 给定 n 是一个正整数。
 */