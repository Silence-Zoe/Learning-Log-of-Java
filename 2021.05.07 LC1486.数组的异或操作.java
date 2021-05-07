/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：35.2 MB，在所有 Java 提交中击败了 45.28% 的用户
 */
class Solution {
    public int xorOperation(int n, int start) {
        int ans = start;
        for (int i = 1; i < n; i++) {
            ans = ans ^ (start + 2 * i);
        }
        return ans;
    }
}
/**
 * 给你两个整数，n 和 start 。
 * 数组 nums 定义为：nums[i] = start + 2*i（下标从 0 开始）且 n == nums.length 。
 * 请返回 nums 中所有元素按位异或（XOR）后得到的结果。
 * --------------------------------------------------
 * 提示：
 * 1 <= n <= 1000
 * 0 <= start <= 1000
 * n == nums.length
 */