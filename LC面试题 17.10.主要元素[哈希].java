/**
 * 执行用时：11 ms，在所有 Java 提交中击败了 24.51% 的用户
 * 内存消耗：43.5 MB，在所有 Java 提交中击败了 55.03% 的用户
 */
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int x : nums) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
            if (e.getValue() > nums.length / 2) {
                return e.getKey();
            }
        }
        return -1;
    }
}
/**
 * 数组中占比超过一半的元素称之为主要元素。给你一个 正整数 数组，找出其中的主要元素。若没有，返回 -1 。请设计时间复杂度为 O(N) 、空间复杂度为 O(1) 的解决方案。
 */