/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 99.97% 的用户
 * 内存消耗：38.9 MB，在所有 Java 提交中击败了 27.72% 的用户
 */
class Solution {
    private List<Integer> path = new ArrayList<>();
    private List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtracing(nums, 0);
        return ans;    
    }

    private void backtracing(int[] nums, int ind) {
        ans.add(new ArrayList(path));
        for (int i = ind; i < nums.length; i++) {
            if (i > ind && nums[i] == nums[i - 1]) {
                continue;
            }
            path.add(nums[i]);
            backtracing(nums, i + 1);
            path.remove(path.size() - 1);
        }
    }
}
/**
 * 给你一个整数数组 nums ，其中可能包含重复元素，请你返回该数组所有可能的子集（幂集）。
 * 解集 不能 包含重复的子集。返回的解集中，子集可以按 任意顺序 排列。
 * --------------------------------------------------
 * 提示：
 * 1 <= nums.length <= 10
 * -10 <= nums[i] <= 10
 */
