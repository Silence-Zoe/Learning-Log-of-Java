/**
 * 执行用时：17 ms，在所有 Java 提交中击败了 13.30% 的用户
 * 内存消耗：53.2 MB，在所有 Java 提交中击败了 14.34% 的用户
 */
class Solution {
    private List<List<String>> ans = new ArrayList<>();
    private List<String> path = new ArrayList<>();

    public List<List<String>> partition(String s) {
        backtracing(s, 0);
        return ans;
    }

    private void backtracing(String s, int ind) {

        if (ind >= s.length()) {
            ans.add(new ArrayList(path));
            return;
        }

        for (int i = ind; i < s.length(); i++) {
            String str = s.substring(ind, i + 1);
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            if (str.equals(sb.toString())) {
                path.add(str);
            } else {
                continue;
            }
            backtracing(s, i + 1);
            path.remove(path.size() - 1);
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
