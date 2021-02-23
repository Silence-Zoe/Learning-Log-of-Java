/**
 * 执行用时：2 ms，在所有 Java 提交中击败了 50.58% 的用户
 * 内存消耗：36.8 MB，在所有 Java 提交中击败了 33.53% 的用户
 */
class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '#') {
                if (!s1.empty()) {
                    s1.pop();
                }
            } else {
                s1.push(S.charAt(i));
            }
        }
        for (int i = 0; i < T.length(); i++) {
            if (T.charAt(i) == '#') {
                if (!s2.empty()) {
                    s2.pop();
                }
            } else {
                s2.push(T.charAt(i));
            }
        }
        boolean ans = true;
        while (!s1.empty() && !s2.empty()) {
            if (s1.pop() != s2.pop()) {
                ans = false;
                break;
            }
        }
        if (!s1.empty() || !s2.empty()) {
            ans = false;
        }
        return ans;    
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