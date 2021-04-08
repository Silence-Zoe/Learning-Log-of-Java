/**
 * 执行用时：7 ms，在所有 Java 提交中击败了 30.03% 的用户
 * 内存消耗：39 MB，在所有 Java 提交中击败了 72.21% 的用户
 */
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i;
        for (i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                break;
            }
        }
        return nums[i];
    }
}
/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 */