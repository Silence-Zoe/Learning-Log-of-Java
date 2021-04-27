/**
 * 执行用时：3 ms，在所有 Java 提交中击败了 87.74% 的用户
 * 内存消耗：38.5 MB，在所有 Java 提交中击败了 83.29% 的用户
 */
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }
}
/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * --------------------------------------------------
 * 提示：
 * 你可以假设字符串只包含小写字母。
 */