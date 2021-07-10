/**
 * 执行用时：5 ms，在所有 Java 提交中击败了 78.81% 的用户
 * 内存消耗：44.4 MB，在所有 Java 提交中击败了 72.96% 的用户
 */
class Solution {
    private List<List<Integer>> ans = new ArrayList<>();
    private List<Integer> path = new ArrayList<>();

    public List<List<Integer>> findSubsequences(int[] nums) {
        backtracing(nums, 0);
        return ans;
    }

    private void backtracing(int[] nums, int ind) {
        if (path.size() > 1) {
            ans.add(new ArrayList(path));
            if (path.size() == nums.length) {
                return;
            }
        }

        for (int i = ind; i < nums.length; i++) {
            boolean f = false;
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j] && (j >= ind)) {
                    f = true;
                }
            }
            if (f || !path.isEmpty() && nums[i] < path.get(path.size() - 1) || i > ind && nums[i] == nums[i - 1]) {
                continue;
            }    
            path.add(nums[i]);
            backtracing(nums, i + 1);
            path.remove(path.size() - 1);
        }
    }
}
/**
 * 给定一个整型数组, 你的任务是找到所有该数组的递增子序列，递增子序列的长度至少是 2 。
 * --------------------------------------------------
 * 提示：
 * 给定数组的长度不会超过15。
 * 数组中的整数范围是 [-100,100]。
 * 给定数组中可能包含重复数字，相等的数字应该被视为递增的一种情况。
 */
