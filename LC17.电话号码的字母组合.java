/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 83.91% 的用户
 * 内存消耗：37 MB，在所有 Java 提交中击败了 79.95% 的用户
 */
class Solution {
    private List<String> ans = new ArrayList<>();
    private StringBuffer path = new StringBuffer();
    Map<Character, String> hm = new HashMap<>();
    public List<String> letterCombinations(String digits) {
        hm.put('2', "abc");
        hm.put('3', "def"); 
        hm.put('4', "ghi"); 
        hm.put('5', "jkl"); 
        hm.put('6', "mno"); 
        hm.put('7', "pqrs"); 
        hm.put('8', "tuv"); 
        hm.put('9', "wxyz"); 
        
        int n = digits.length();
        if (n == 0) {
            return ans;
        }
        char[] str = digits.toCharArray();
        backtracing(str, n, 0);
        return ans;
    }

    private void backtracing(char[] str, int n, int ind) {
        if (path.length() == n) {
            ans.add(new String(path));
            return;
        }

        for (int i = ind; i < n - (n - path.length()) + 1; i++) {
            String s = hm.get(str[i]);
            for (int j = 0; j < s.length(); j++) {
                path.append(s.charAt(j));
                backtracing(str, n, ind + 1);
                path.deleteCharAt(path.length() - 1);
            }
        }
    }
}
/**
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * --------------------------------------------------
 * 提示：
 * 0 <= digits.length <= 4
 * digits[i] 是范围 ['2', '9'] 的一个数字。
 */
