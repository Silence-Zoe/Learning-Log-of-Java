/**
 * 执行用时：4 ms，在所有 Java 提交中击败了 40.66% 的用户
 * 内存消耗：38.4 MB，在所有 Java 提交中击败了 68.89% 的用户
 */
class Solution {
    private List<String> ans = new ArrayList<>();
    private StringBuilder path = new StringBuilder();

    public List<String> restoreIpAddresses(String s) {
        if (s.length() < 4) {
            return ans;
        }
        backtracing(s, 0, 0);
        return ans;
    }

    private void backtracing(String s, int ind, int n) {
        if (n == 4) {
            path.deleteCharAt(path.length() - 1);
            String a = path.substring(0, path.length());
            if (!ans.contains(a)) {
                ans.add(a);
            }
            n = 0;
            return;
        }

        for (int i = ind; i < s.length(); i++) {
            if (n > 4 || i - ind > 3 || n == 3 && s.length() - i > 3){
                return;
            }
            StringBuilder str = new StringBuilder(s.substring(ind, i + 1));
            if (n == 3) {
                str = new StringBuilder(s.substring(ind));
            }
            int x = Integer.parseInt(str.toString());
            if (x == 0 && str.length() == 1 || (x > 0 && x <= 255 && str.charAt(0) != '0')) {
                path.append(str + ".");
            } else {
                continue;
            }
            backtracing(s, i + 1, n + 1);
            path.delete(path.lastIndexOf(str.toString()), path.length());
        }
    }
}
/**
 * 给你一个字符串 s，请你将 s 分割成一些子串，使每个子串都是 回文串 。返回 s 所有可能的分割方案。
 * 回文串 是正着读和反着读都一样的字符串。
 * --------------------------------------------------
 * 提示：
 * 1 <= s.length <= 16
 * s 仅由小写英文字母组成
 */