/**
 * 执行用时：4 ms，在所有 Java 提交中击败了 63.66% 的用户
 * 内存消耗：38.7 MB，在所有 Java 提交中击败了 29.78% 的用户
 */
class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }
        String str = s.toLowerCase();
        int i = 0, j = s.length() - 1;
        while (i <= j) {
            while (i < j && (str.charAt(i) < '0' || str.charAt(i) > '9') && (str.charAt(i) < 'a' || str.charAt(i) > 'z')) {
                i++;
            }
            while (i < j && (str.charAt(j) < '0' || str.charAt(j) > '9') && (str.charAt(j) < 'a' || str.charAt(j) > 'z')) {
                j--;
            }
            if (str.charAt(i++) != str.charAt(j--)) {
                return false;
            }
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