/**
 * 执行用时：786 ms，在所有 Java 提交中击败了 5.01% 的用户
 * 内存消耗：38.5 MB，在所有 Java 提交中击败了 85.50% 的用户
 */
class Solution {
    private List<List<Integer>> ans = new ArrayList<>();
    private List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtracing(candidates, target, 0);
        return ans;
    }

    private void backtracing(int[] candidates, int target, int ind) {
        if (target == 0) {
            if (!ans.contains(path)) {
                ans.add(new ArrayList(path));
            }
        }

        for (int i = ind; i < candidates.length && target - candidates[i] >= 0; i++) {
            int x = candidates[i];
            path.add(x);
            backtracing(candidates, target - x, i + 1);
            path.remove(path.size() - 1);
        }
    }
}
/**
 * 给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 * candidates 中的每个数字在每个组合中只能使用一次。
 * --------------------------------------------------
 * 提示：
 * 所有数字（包括目标数）都是正整数。
 * 解集不能包含重复的组合。
 */