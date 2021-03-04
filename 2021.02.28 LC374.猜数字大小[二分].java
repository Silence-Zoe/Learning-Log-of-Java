/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：35.1 MB，在所有 Java 提交中击败了 69.48% 的用户
 */
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l = 0, r = n;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (guess(m) == 0) {
                return m;
            } else if (guess(m) == 1) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }
}
/**
 * 猜数字游戏的规则如下：
 *     每轮游戏，我都会从 1 到 n 随机选择一个数字。 请你猜选出的是哪个数字。
 *     如果你猜错了，我会告诉你，你猜测的数字比我选出的数字是大了还是小了。
 * 你可以通过调用一个预先定义好的接口 int guess(int num) 来获取猜测结果，返回值一共有 3 种可能的情况（-1，1 或 0）：
 *     -1：我选出的数字比你猜的数字小 pick < num
 *     1：我选出的数字比你猜的数字大 pick > num
 *     0：我选出的数字和你猜的数字一样。恭喜！你猜对了！pick == num
 * 返回我选出的数字。
 * --------------------------------------------------
 * 提示：
 * 1 <= n <= 2^31 - 1
 * 1 <= pick <= n
 */