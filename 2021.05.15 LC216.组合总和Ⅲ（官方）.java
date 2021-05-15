/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 51.05% 的用户
 * 内存消耗：36.2 MB，在所有 Java 提交中击败了 27.84% 的用户
 */
class Solution {
    private List<List<Integer>> ans = new ArrayList<>();
    private List<Integer> path = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        backtracing(n, k, 1, 0);
        return ans;
    }

    public void backtracing(int n, int k, int ind, int sum) {
        if (path.size() == k) {
            if (sum == n) {
                ans.add(new ArrayList(path));
            }
            return;
        }

        for (int i = ind; i <= 9 - (k - path.size()) + 1; i++) {
            path.add(i);
            backtracing(n, k, i + 1, sum + i);
            path.remove(path.size() - 1);
        }
    }
}
/**
 * 找出所有相加之和为 n 的 k 个数的组合。组合中只允许含有 1 - 9 的正整数，并且每种组合中不存在重复的数字。
 * --------------------------------------------------
 * 提示：
 * 所有数字都是正整数。
 * 解集不能包含重复的组合。 
 */