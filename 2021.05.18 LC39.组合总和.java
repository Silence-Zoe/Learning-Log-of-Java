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
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * --------------------------------------------------
 * 提示：
 * 0 <= digits.length <= 4
 * digits[i] 是范围 ['2', '9'] 的一个数字。
 */