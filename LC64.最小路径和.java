/**
 * 执行用时：3 ms，在所有 Java 提交中击败了 86.98% 的用户
 * 内存消耗：40.9 MB，在所有 Java 提交中击败了 89.07% 的用户
 */
class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = grid[i][j];
                    continue;
                }
                int a = i == 0 ? Integer.MAX_VALUE : dp[i - 1][j];
                int b = j == 0 ? Integer.MAX_VALUE : dp[i][j - 1];
                dp[i][j] = grid[i][j] + Math.min(a, b);
            }
        }
        return dp[m - 1][n - 1];
    }
}
/**
 * 给定一个包含非负整数的 m x n 网格 grid ，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * --------------------------------------------------
 * 提示：
 * m == grid.length
 * n == grid[i].length
 * 1 <= m, n <= 200
 * 0 <= grid[i][j] <= 100
 */