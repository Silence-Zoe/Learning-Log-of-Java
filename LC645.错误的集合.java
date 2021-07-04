/**
 * 执行用时：12 ms，在所有 Java 提交中击败了 34.83% 的用户
 * 内存消耗：39.9 MB，在所有 Java 提交中击败了 63.06% 的用户
 */
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ret = new int[]{0, 0};
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            ret[1] ^= (1 + i) ^ nums[i];
            if (nums[i] == nums[i + 1]) {
                ret[0] = nums[i];
            }
        }
        ret[1] ^= (nums.length) ^ nums[nums.length -1];
        ret[1] = (ret[1] ^ ret[0]);
        return ret;
    }
}
/**
 * 集合 s 包含从 1 到 n 的整数。不幸的是，因为数据错误，导致集合里面某一个数字复制了成了集合里面的另外一个数字的值，导致集合 丢失了一个数字 并且 有一个数字重复 。
 * 给定一个数组 nums 代表了集合 S 发生错误后的结果。
 * 请你找出重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。
 * --------------------------------------------------
 * 提示：
 * 2 <= nums.length <= 10^4
 * 1 <= nums[i] <= 10^4
 */