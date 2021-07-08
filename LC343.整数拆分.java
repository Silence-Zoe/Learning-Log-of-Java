/**
 * 执行用时：2 ms，在所有 Java 提交中击败了 13.35% 的用户
 * 内存消耗：34.9 MB，在所有 Java 提交中击败了 93.42% 的用户
 */
class Solution {
    public int integerBreak(int n) {
        if (n < 3) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                int t = Math.max(dp[j] * dp[i - j], j * dp[i - j]);
                dp[i] = Math.max(dp[i], t);
                dp[i] = Math.max(dp[i], j * (i - j));
            }
        }

        return dp[n];
    }
}
/**
 * 给定一个正整数 n，将其拆分为至少两个正整数的和，并使这些整数的乘积最大化。 返回你可以获得的最大乘积。
 * --------------------------------------------------
 * 提示：
 * 你可以假设 n 不小于 2 且不大于 58。
 */
