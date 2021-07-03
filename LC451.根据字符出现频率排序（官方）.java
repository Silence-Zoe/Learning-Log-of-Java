/**
 * 执行用时：15 ms，在所有 Java 提交中击败了 63.32% 的用户
 * 内存消耗：39.2 MB，在所有 Java 提交中击败了 80.54% 的用户
 */
class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            int frequency = map.getOrDefault(c, 0) + 1;
            map.put(c, frequency);
        }
        List<Character> list = new ArrayList<Character>(map.keySet());
        Collections.sort(list, (a, b) -> map.get(b) - map.get(a));
        StringBuffer sb = new StringBuffer();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            char c = list.get(i);
            int frequency = map.get(c);
            for (int j = 0; j < frequency; j++) {
                sb.append(c);
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