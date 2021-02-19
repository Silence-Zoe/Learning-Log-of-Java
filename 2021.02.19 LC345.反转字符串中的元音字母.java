/**
 * 执行用时：3 ms，在所有 Java 提交中击败了 87.31% 的用户
 * 内存消耗：38.6 MB，在所有 Java 提交中击败了 32.78% 的用户
 */
class Solution {
    public String reverseVowels(String s) {
        if (s.length() == 0) {
            return s;
        }
        char[] str = s.toCharArray();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            i = isVowel(str[i]) ? i : ++i;
            j = isVowel(str[j]) ? j : --j;
            if (isVowel(str[i]) && isVowel(str[j])) {
                char t = str[i];
                str[i] = str[j];
                str[j] = t;
                i++;
                j--;
            }
        }
        return new String(str);
    }
    public boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }
}
/**
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 * --------------------------------------------------
 * 提示：
 * 元音字母不包含字母 "y" 。
 */