/**
 * 执行用时：5 ms，在所有 Java 提交中击败了 54.77% 的用户
 * 内存消耗：38.4 MB，在所有 Java 提交中击败了 89.90% 的用户
 */
class Solution {
    private List<StringBuilder> path = new ArrayList<>();
    private List<List<String>> ans = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < n; i++) {
            str.append(".");
        }
        for (int i = 0; i < n; i++) {
            String s = new String(str.toString());
            path.add(new StringBuilder(s));    
        }

        boolean[] usedLine = new boolean[n];
        backtracing(n, 0, usedLine);
        return ans;
    }

    private void backtracing(int n, int row, boolean[] usedLine) {
        if (row >= n) {
            ans.add(convert(path));
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!usedLine[i] && !judgeOblique(row, i)) {
                path.get(row).setCharAt(i, 'Q');
                usedLine[i] = true;
                
                backtracing(n, row + 1, usedLine);
                path.get(row).setCharAt(i, '.');
                usedLine[i] = false;
            }
        }
    }

    private boolean judgeOblique(int row, int i) {
        for (int r = 0; r < row; r++) {
            int j = path.get(r).indexOf("Q");
            if (Math.abs(r - row) == Math.abs(j - i)) {
                return true;
            }
        }
        return false;
    }

    private List<String> convert(List<StringBuilder> path) {
        List<String> ret = new ArrayList<>();
        for (StringBuilder s : path) {
            ret.add(s.toString());
        }
        return ret;
    }
}
/**
 * n 皇后问题 研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
 * 给你一个整数 n ，返回所有不同的 n 皇后问题 的解决方案。
 * 每一种解法包含一个不同的 n 皇后问题 的棋子放置方案，该方案中 'Q' 和 '.' 分别代表了皇后和空位。
 * --------------------------------------------------
 * 提示：
 * 1 <= n <= 9
 * 皇后彼此不能相互攻击，也就是说：任何两个皇后都不能处于同一条横行、纵行或斜线上。
 */
