/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 83.95% 的用户
 * 内存消耗：36.8 MB，在所有 Java 提交中击败了 31.77% 的用户
 */
class Solution {
    public boolean backspaceCompare(String S, String T) {
        return build(S).equals(build(T));
    }

    public String build(String str) {
        StringBuffer ret = new StringBuffer();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char ch = str.charAt(i);
            if (ch != '#') {
                ret.append(ch);
            } else {
                if (ret.length() > 0) {
                    ret.deleteCharAt(ret.length() - 1);
                }
            }
        }
        return ret.toString();
    }
}
/**
 * 给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 # 代表退格字符。
 * --------------------------------------------------
 * 提示：
 * 如果对空文本输入退格字符，文本继续为空。
 * S 和 T 只含有小写字母以及字符 '#'。
 * 1 <= S.length <= 200
 * 1 <= T.length <= 200
 */