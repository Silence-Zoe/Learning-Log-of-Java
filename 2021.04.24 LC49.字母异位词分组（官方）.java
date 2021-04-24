/**
 * 执行用时：7 ms，在所有 Java 提交中击败了 96.00% 的用户
 * 内存消耗：41.5 MB，在所有 Java 提交中击败了 55.99% 的用户
 */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (String str : strs) {
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String key = new String(array);
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<List<String>>(map.values());
    }
}
/**
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 * --------------------------------------------------
 * 提示：
 * 所有输入均为小写字母。
 * 不考虑答案输出的顺序。
 */