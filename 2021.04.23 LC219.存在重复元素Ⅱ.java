/**
 * 执行用时：8 ms，在所有 Java 提交中击败了 94.45% 的用户
 * 内存消耗：43.9 MB，在所有 Java 提交中击败了 33.15% 的用户
 */
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                if (i - hm.get(nums[i]) <= k) {
                    return true;
                }
            }
            hm.put(nums[i], i);
        }
        return false;
    }
}
/**
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的 绝对值 至多为 k。
 */