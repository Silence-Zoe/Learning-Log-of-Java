/**
 * 执行用时：8 ms，在所有 Java 提交中击败了 42.30% 的用户
 * 内存消耗：44.4 MB，在所有 Java 提交中击败了 33.92% 的用户
 */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int x : nums) {
            if (!set.add(x)) {
                return true;
            }
        }
        return false;
    }
}
/**
 * 给定一个整数数组，判断是否存在重复元素。
 * 如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 */