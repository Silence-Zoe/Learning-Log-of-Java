/**
 * 执行用时：7 ms，在所有 Java 提交中击败了 96.00% 的用户
 * 内存消耗：41.2 MB，在所有 Java 提交中击败了 91.14% 的用户
 */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> hm = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String cur = new String(ch);
            if (!hm.containsKey(cur)) {
                hm.put(cur, new ArrayList<String>());
                ans.add(hm.get(cur));
            }
            hm.get(cur).add(strs[i]);
        }
        return ans;
    }
}
/**
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 * --------------------------------------------------
 * 提示：
 * 所有输入均为小写字母。
 * 不考虑答案输出的顺序。
 */