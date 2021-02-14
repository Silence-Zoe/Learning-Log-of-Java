/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：40.2 MB，在所有 Java 提交中击败了 77.14% 的用户
 */
class Solution {
    public int removeDuplicates(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }
            int i = 0, j = 1, cnt = 1;
            for (; j < nums.length; j++) {
                if (nums[j] != nums[i]){
                    nums[++i] = nums[j];
                    cnt++;
                }
            }
            return cnt;
    }
}