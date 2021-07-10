/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 85.69% 的用户
 * 内存消耗：38.9 MB，在所有 Java 提交中击败了 21.79% 的用户
 */
class Solution {
    private List<Integer> path = new ArrayList<>();
    private List<List<Integer>> ans = new ArrayList<>();
    
    public List<List<Integer>> subsets(int[] nums) {
        backtracing(nums, 0);
        return ans;
    }

    private void backtracing(int[] nums, int ind) {
        ans.add(new ArrayList(path));
        for (int i = ind; i < nums.length; i++) {
            path.add(nums[i]);
            backtracing(nums, i + 1);
            path.remove(path.size() - 1);
        }
    }
}
/**
 * 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
 * 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
 * --------------------------------------------------
 * 提示：
 * 1 <= nums.length <= 10
 * -10 <= nums[i] <= 10
 * nums 中的所有元素 互不相同
 */
