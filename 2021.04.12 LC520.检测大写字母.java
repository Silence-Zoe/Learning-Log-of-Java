/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：36.9 MB，在所有 Java 提交中击败了 44.18% 的用户
 */
class Solution {
    public boolean detectCapitalUse(String word) {
        int cnt = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                cnt++;
            }
        }
        if (cnt == word.length() || cnt == 0 || cnt == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') {
            return true;
        }
        return false;
    }
}
/**
 * 给定一个单词，你需要判断单词的大写使用是否正确。
 * 我们定义，在以下情况时，单词的大写用法是正确的：
 *     全部字母都是大写，比如"USA"。
 *     单词中所有字母都不是大写，比如"leetcode"。
 *     如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。
 * 否则，我们定义这个单词没有正确使用大写字母。
 * --------------------------------------------------
 * 提示：
 * 输入是由大写和小写拉丁字母组成的非空单词。
 */