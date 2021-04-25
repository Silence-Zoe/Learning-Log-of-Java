/**
 * 执行用时：2 ms，在所有 Java 提交中击败了 95.26% 的用户
 * 内存消耗：38.8 MB，在所有 Java 提交中击败了 21.95% 的用户
 */
class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> hs1 = new HashSet<>();
        HashSet<Character> hs2 = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] >= '1' && board[i][j] <= '9') {
                    if (!hs1.add(board[i][j])) {
                        return false;
                    }
                }
                if (board[j][i] >= '1' && board[j][i] <= '9') {
                    if (!hs2.add(board[j][i])) {
                        return false;
                    }
                }
            }
            hs1.clear();
            hs2.clear();
        }

        for (int x = 0; x < 9; x += 3) {
            for (int y = 0; y < 9; y += 3) {
                
                for (int i = x; i < x + 3; i++) {
                    for (int j = y; j < y + 3; j++) {
                        if (board[i][j] >= '1' && board[i][j] <= '9') {
                            if(!hs1.add(board[i][j])) {
                                return false;
                            }
                        }
                    }
                }

                hs1.clear();
            }
        }

        return true;
    }
}
/**
 * 请你判断一个 9x9 的数独是否有效。只需要 根据以下规则 ，验证已经填入的数字是否有效即可。
 *     数字 1-9 在每一行只能出现一次。
 *     数字 1-9 在每一列只能出现一次。
 *     数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。（请参考示例图）
 * 数独部分空格内已填入了数字，空白格用 '.' 表示。
 * --------------------------------------------------
 * 提示：
 * 一个有效的数独（部分已被填充）不一定是可解的。
 * 只需要根据以上规则，验证已经填入的数字是否有效即可。
 */