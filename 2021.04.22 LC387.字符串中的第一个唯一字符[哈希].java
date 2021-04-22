/**
 * 执行用时：57 ms，在所有 Java 提交中击败了 5.12% 的用户
 * 内存消耗：39.1 MB，在所有 Java 提交中击败了 39.17% 的用户
 */
class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
            } else {
                hm.put(s.charAt(i), 1);
            }
        }
        int min = s.length() + 1;
        char ch;
        for (char key : hm.keySet()) {
            if (hm.get(key) == 1) {
                min = min < s.indexOf(key) ? min : s.indexOf(key);
            }
        }
        if (min > s.length()) {
            return -1;
        }
        return min;
    }
}
/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * --------------------------------------------------
 * 提示：
 * 你可以假定该字符串只包含小写字母。
 */