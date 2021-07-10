/**
 * 执行用时：3 ms，在所有 Java 提交中击败了 25.22% 的用户
 * 内存消耗：38.9 MB，在所有 Java 提交中击败了 8.51% 的用户
 */
class Solution {
    private List<List<Integer>> ans = new ArrayList<>();
    private List<Integer> path = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        backtracing(nums);
        return ans;
    }

    private void backtracing(int[] nums) {
        if (path.size() == nums.length) {
            ans.add(new ArrayList(path));
        }

        for (int i = 0; i < nums.length; i++) {
            if (path.contains(nums[i])) {
                continue;
            }
            path.add(nums[i]);
            backtracing(nums);
            path.remove(path.size() - 1);
        }
    }
}
/**
 * 给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
 * --------------------------------------------------
 * 提示：
 * 1 <= nums.length <= 6
 * -10 <= nums[i] <= 10
 * nums 中的所有整数 互不相同
 */
