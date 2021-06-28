/**
 * 执行用时：2 ms，在所有 Java 提交中击败了 27.84% 的用户
 * 内存消耗：35.5 MB，在所有 Java 提交中击败了 57.14% 的用户
 */
class Solution {
    public int reverse(int x) {
        double ans = 0;	//使用了double来辅助检查溢出，实际上不合题意
        boolean flag = false;
        if (x < 0) {
            x = -x;
            flag = true;
        }
        ans = x % 10;
        while ((x = x / 10) != 0) {
            ans = ans * 10 + x % 10; 
        }
        if (flag) {
            ans = -ans;
        }
        if (ans < -2147483648 || ans > 2147483647) {
            return 0;
        }
        return (int) ans;
    }
}
/**
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 * --------------------------------------------------
 * 提示：
 * -2^31 <= x <= 2^31 - 1
 */