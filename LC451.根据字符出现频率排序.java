/**
 * 执行用时：24 ms，在所有 Java 提交中击败了 27.81% 的用户
 * 内存消耗：39.2 MB，在所有 Java 提交中击败了 80.11% 的用户
 */
class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(hm.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> e : list) {
            for (int i = 0; i < e.getValue(); i++) {
                sb.append(e.getKey());
            }
        }
        return sb.toString();
    }
}
/**
 * 给定一个字符串，请将字符串里的字符按照出现的频率降序排列。
 * --------------------------------------------------
 * 提示：
 * 1 <= s.length <= 5 * 10^5
 */
