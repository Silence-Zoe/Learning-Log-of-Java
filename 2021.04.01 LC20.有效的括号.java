/**
 * 执行用时：2 ms，在所有 Java 提交中击败了 76.41% 的用户
 * 内存消耗：36.7 MB，在所有 Java 提交中击败了 34.25% 的用户
 */
class Solution {
    Deque<Character> st = new LinkedList<>();
    public boolean isValid(String s) {

        for (int i = 0; i < s.length(); i++) {
            if (jdg(s.charAt(i))) {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }
        return st.isEmpty();
    }
    public boolean jdg(char c) {
        if (st.isEmpty()) {
            return false;
        }
        if (c == ')' && st.peek() == '(' ||
            c == ']' && st.peek() == '[' ||
            c == '}' && st.peek() == '{' ) {
                return true;
        }
        return false;
    }
}
/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * 有效字符串需满足：
 *     左括号必须用相同类型的右括号闭合。
 *     左括号必须以正确的顺序闭合。
 * --------------------------------------------------
 * 提示：
 * 1 <= s.length <= 10^4
 * s 仅由括号 '()[]{}' 组成
 */