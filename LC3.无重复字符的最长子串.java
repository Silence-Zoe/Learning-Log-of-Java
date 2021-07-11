/**
 * 执行用时：73 ms，在所有 Java 提交中击败了 15.02% 的用户
 * 内存消耗：38.9 MB，在所有 Java 提交中击败了 21.03% 的用户
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }

        char[] str = s.toCharArray();
        int ans = 1;
        HashSet<Character> hs = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            int j;
            for (j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (!hs.add(ch)) {
                    ans = ans >= (j - i) ? ans : (j - i);
                    break;
                }
            }
            if (j == s.length()) {
                return ans >= (j - i) ? ans : (j - i);
            }
            hs.clear();
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
