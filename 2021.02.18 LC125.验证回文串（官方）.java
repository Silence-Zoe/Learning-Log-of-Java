/**
 * 执行用时：5 ms，在所有 Java 提交中击败了 46.90% 的用户
 * 内存消耗：38.7 MB，在所有 Java 提交中击败了 28.70% 的用户
 */
class Solution {
    public boolean isPalindrome(String s) {
        StringBuffer sgood = new StringBuffer();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sgood.append(Character.toLowerCase(ch));
            }
        }
        int n = sgood.length();
        int left = 0, right = n - 1;
        while (left < right) {
        if (Character.toLowerCase(sgood.charAt(left)) != Character.toLowerCase(sgood.charAt(right))) {
            return false;
        }
        left++;
        right--;
        }
        return true;
    }
}
/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * --------------------------------------------------
 * 提示：
 * 本题中，我们将空字符串定义为有效的回文串。
 */