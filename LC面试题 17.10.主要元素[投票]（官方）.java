/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：44.5 MB，在所有 Java 提交中击败了 5.18% 的用户
 */
class Solution {
    public int majorityElement(int[] nums) {
        int candidate = -1;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        count = 0;
        int length = nums.length;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }
        return count * 2 > length ? candidate : -1;
    }
}
/**
 * 数组中占比超过一半的元素称之为主要元素。给你一个 正整数 数组，找出其中的主要元素。若没有，返回 -1 。请设计时间复杂度为 O(N) 、空间复杂度为 O(1) 的解决方案。
 */