/**
 * 执行用时：7 ms，在所有 Java 提交中击败了 79.18% 的用户
 * 内存消耗：38.4 MB，在所有 Java 提交中击败了 84.28% 的用户
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
        int rk = -1, ans = 0;
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                occ.add(s.charAt(rk + 1));
                ++rk;
            }

            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }
}
/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * --------------------------------------------------
 * 提示：
 * 0 <= s.length <= 5 * 10^4
 * s 由英文字母、数字、符号和空格组成
 */