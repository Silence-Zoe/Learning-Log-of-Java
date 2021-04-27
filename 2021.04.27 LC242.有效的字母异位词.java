/**
 * 执行用时：3 ms，在所有 Java 提交中击败了 87.74% 的用户
 * 内存消耗：38.3 MB，在所有 Java 提交中击败了 97.08% 的用户
 */
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() == 0 && t.length() == 0) {
            return true;
        }
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1, s2);
    }
}
/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * --------------------------------------------------
 * 提示：
 * 你可以假设字符串只包含小写字母。
 */