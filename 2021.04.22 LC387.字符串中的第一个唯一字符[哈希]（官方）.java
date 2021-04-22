/**
 * 执行用时：36 ms，在所有 Java 提交中击败了 29.97% 的用户
 * 内存消耗：38.9 MB，在所有 Java 提交中击败了 66.72% 的用户
 */
class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> frequency = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < s.length(); ++i) {
            if (frequency.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * --------------------------------------------------
 * 提示：
 * 你可以假定该字符串只包含小写字母。
 */