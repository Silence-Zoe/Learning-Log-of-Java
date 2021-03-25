/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：36.3 MB，在所有 Java 提交中击败了 60.04% 的用户
 */
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        int[][] a = new int[numRows][numRows];
        for (int i = 0; i < numRows; i++) {
            a[i][0] = 1;
        }
        for (int i = 1; i < numRows; i++) {
            a[i][i] = 1;
        }

        for (int i = 2; i < numRows; i++) {
            for (int j = 1; j < numRows - 1; j++) {
                a[i][j] = a[i - 1][j] + a[i - 1][j - 1];
            }
        }

        for (int i = 0; i < numRows; i++) {
            List<Integer> cur = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                cur.add(a[i][j]);
            }
            ans.add(cur);
        }
        return ans;
    }
}
/**
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 */