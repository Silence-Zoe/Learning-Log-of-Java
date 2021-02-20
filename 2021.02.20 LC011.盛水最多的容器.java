/**
 * 执行用时：3 ms，在所有 Java 提交中击败了 91.65% 的用户
 * 内存消耗：39.9 MB，在所有 Java 提交中击败了 67.05% 的用户
 */
class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1;
        int ans = 0, cur = 0;
        while (i < j) {
            cur = (j - i) * Math.min(height[i], height[j]);
            if (cur > ans) {
                ans = cur;
            } 
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return ans;
    }
}
/**
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0) 。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * --------------------------------------------------
 * 提示：
 * 你不能倾斜容器。
 * n = height.length
 * 2 <= n <= 3 * 104
 * 0 <= height[i] <= 3 * 104
 */