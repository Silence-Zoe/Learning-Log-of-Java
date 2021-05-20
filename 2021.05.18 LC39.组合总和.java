/**
 * 执行用时：157 ms，在所有 Java 提交中击败了 5.14% 的用户
 * 内存消耗：38.8 MB，在所有 Java 提交中击败了 28.34% 的用户
 */
class Solution {
    private List<List<Integer>> ans = new ArrayList<>();
    private List<Integer> path = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtracing(candidates, target);
        return ans;
    }

    private void backtracing(int[] candidates, int target) {
        if (target == 0) {
            Object[] a = path.toArray();
            Arrays.sort(a);
            if (!ans.contains(Arrays.asList(a))) {
                ans.add(new ArrayList(path));
            }
            return;
        }
        if (target < 0) {
            return;
        }

        for (int i = 0; i < candidates.length; i++) {
            int x = candidates[i];
            path.add(x);
            backtracing(candidates, target - x);
            path.remove(path.size() - 1);
        }
    }
}
/**
 * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 * candidates 中的数字可以无限制重复被选取。
 * --------------------------------------------------
 * 提示：
 * 所有数字（包括 target）都是正整数。
 * 解集不能包含重复的组合。 
 * 1 <= candidates.length <= 30
 * 1 <= candidates[i] <= 200
 * candidate 中的每个元素都是独一无二的。
 * 1 <= target <= 500
 */