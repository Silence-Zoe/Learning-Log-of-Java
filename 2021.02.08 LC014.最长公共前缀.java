/**
 * 执行用时：10 ms，在所有 Java 提交中击败了 9.27% 的用户
 * 内存消耗：38.4 MB，在所有 Java 提交中击败了 7.17% 的用户
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        if (strs.length == 0 || strs == null) {
            return ans;
        }
        boolean flag = true;
        int min = strs[0].length();
        for (int i = 0; i < strs.length; i++) {
            if (min > strs[i].length()) {
                min = strs[i].length();
            }
        }
        for (int i = 0; i < min; i++) {
           for (int j = 0; flag && j < strs.length - 1; j++) {
               flag = strs[j].charAt(i) == strs[j + 1].charAt(i);
           }
           if (flag) {
               ans += strs[0].charAt(i);
           }
        }
        return ans;
    }
}
/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * --------------------------------------------------
 * 提示：
 * 0 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] 仅由小写英文字母组成
 */