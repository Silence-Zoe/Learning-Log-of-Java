/**
 * 执行用时：7 ms，在所有 Java 提交中击败了 9.95% 的用户
 * 内存消耗：35.3 MB，在所有 Java 提交中击败了 55.77% 的用户
 */
class Solution {
    private List<StringBuilder> path = new ArrayList<>();

    public int totalNQueens(int n) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n; i++) {
            str.append(".");
        }
        for (int i = 0; i < n; i++) {
            String s = new String(str.toString());
            path.add(new StringBuilder(s));    
        }

        return backtracing(n, 0, 0);
    }

    private int backtracing(int n, int row, int ret) {
        if (row == n) {
            return ++ret;
        }

        for (int i = 0; i < n; i++) {
            if (!judge(row, i)) {
                path.get(row).setCharAt(i, 'Q');
                ret = backtracing(n, row + 1, ret);
                path.get(row).setCharAt(i, '.');
            }
        }
        return ret;
    }

    private boolean judge(int row, int i) {
        for (int r = 0; r < row; r++) {
            int j = path.get(r).indexOf("Q");
            if (j == i || Math.abs(r - row) == Math.abs(j - i)) {
                return true;
            }
        }
        return false;
    }
}
/**
 * n 皇后问题 研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
 * 给你一个整数 n ，返回 n 皇后问题 不同的解决方案的数量。
 * --------------------------------------------------
 * 提示：
 * 1 <= n <= 9
 * 皇后彼此不能相互攻击，也就是说：任何两个皇后都不能处于同一条横行、纵行或斜线上。
 */
