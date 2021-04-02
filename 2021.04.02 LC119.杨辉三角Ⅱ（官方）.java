/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：36.2 MB，在所有 Java 提交中击败了 70.78% 的用户
 */
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<Integer>();
        row.add(1);
        for (int i = 1; i <= rowIndex; i++) {
            row.add((int) ((long) row.get(i - 1) * (rowIndex - i + 1) / i));
        }
        return row;
    }
}
/**
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 */