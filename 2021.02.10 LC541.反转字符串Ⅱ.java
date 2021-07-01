/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：38.4 MB，在所有 Java 提交中击败了 77.39% 的用户
 */
class Solution {
    public String reverseStr(String s, int k) {
        char[] str = s.toCharArray();
        int i, l, r;
        i = l = r = 0;
        for (i = 0; i < str.length - k; i += 2 * k) {
            for (l = i, r = i + k - 1; l <= r; l++, r--) {
                char t = str[l];
                str[l] = str[r];
                str[r] = t;
            }
        }
        if (str.length - i <= k) {
            for (l = i, r = str.length - 1; l <= r; l++, r--) {
                char t = str[l];
                str[l] = str[r];
                str[r] = t;
            }
        }
        return new String(str);
    }
}
/**
 * 给定一个字符串 s 和一个整数 k，你需要对从字符串开头算起的每隔 2k 个字符的前 k 个字符进行反转。
 *     如果剩余字符少于 k 个，则将剩余字符全部反转。
 *     如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
 * --------------------------------------------------
 * 提示：
 * 该字符串只包含小写英文字母。
 * 给定字符串的长度和 k 在 [1, 10000] 范围内。
 */