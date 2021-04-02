/**
 * 执行用时：2 ms，在所有 Java 提交中击败了 31.65% 的用户
 * 内存消耗：36.5 MB，在所有 Java 提交中击败了 7.65% 的用户
 */
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(ret.get(i - 1).get(j - 1) + ret.get(i - 1).get(j));
                }
            }
            ret.add(row);
        }
        return ret.get(rowIndex);
    }
}
/**
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 */