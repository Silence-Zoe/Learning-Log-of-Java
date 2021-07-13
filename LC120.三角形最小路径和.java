/**
 * 执行用时：4 ms，在所有 Java 提交中击败了 37.71% 的用户
 * 内存消耗：38.3 MB，在所有 Java 提交中击败了 79.78% 的用户
 */
class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        int len = m * (m + 1) / 2;
        int[] dp = new int[len];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int x = j + (i + 1) * i / 2;
                int a = triangle.get(i).get(j);
                int b = j + i * (i - 1) / 2;
                int c = j + i * (i - 1) / 2 - 1;
                
                if (x == 0) {
                    dp[x] = a; 
                } else if (j == 0) {
                    dp[x] = a + dp[b];
                } else if (j == i) {
                    dp[x] = a + dp[c];
                } else {
                    dp[x] = a + Math.min(dp[b], dp[c]); 
                }

                if (i == m - 1) {
                    min = Math.min(min, dp[x]);
                }
            }
        }
        return min;
    }
}
/**
 * 给定一个三角形 triangle ，找出自顶向下的最小路径和。
 * 每一步只能移动到下一行中相邻的结点上。相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。也就是说，如果正位于当前行的下标 i ，那么下一步可以移动到下一行的下标 i 或 i + 1 。
 * --------------------------------------------------
 * 提示：
 * 1 <= triangle.length <= 200
 * triangle[0].length == 1
 * triangle[i].length == triangle[i - 1].length + 1
 * -10^4 <= triangle[i][j] <= 10^4
 */