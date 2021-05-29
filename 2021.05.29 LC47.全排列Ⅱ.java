/**
 * 执行用时：9 ms，在所有 Java 提交中击败了 16.6% 的用户
 * 内存消耗：39.1 MB，在所有 Java 提交中击败了 74.70% 的用户
 */
class Solution {
    private List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        backtracing(nums, 0);
        return ans;
    }

    private void backtracing(int[] nums, int ind) {
        if (ind == nums.length) {
            ans.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
            return;
        }
        for (int i = ind; i < nums.length; i++) {
            Arrays.sort(nums, ind, nums.length);
            if (i > ind && nums[i - 1] == nums[i]) {
                continue;
            }

            swap(nums, i, ind);
            backtracing(nums, ind + 1);
            swap(nums, i, ind);
        }
    }

    private void swap (int[] nums, int i, int j) {
        int t = nums[j];
        nums[j] = nums[i];
        nums[i] = t;
    }
}
/**
 * 给定一个可包含重复数字的序列 nums ，按任意顺序 返回所有不重复的全排列。
 * --------------------------------------------------
 * 提示：
 * 1 <= nums.length <= 8
 * -10 <= nums[i] <= 10
 */