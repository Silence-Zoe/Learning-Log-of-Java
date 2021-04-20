/**
 * 执行用时：21 ms，在所有 Java 提交中击败了 39.81% 的用户
 * 内存消耗：38.4 MB，在所有 Java 提交中击败了 78.66% 的用户
 */
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            char val = t.charAt(i);
            if (hm.containsKey(key) && hm.get(key) != val || !hm.containsKey(key) && hm.containsValue(val)) {
                return false;
            }
            hm.put(key, val);
        }
        return true;
    }
}
/**
 * 给定两个字符串 s 和 t，判断它们是否是同构的。
 * 如果 s 中的字符可以按某种映射关系替换得到 t ，那么这两个字符串是同构的。
 * 每个出现的字符都应当映射到另一个字符，同时不改变字符的顺序。不同字符不能映射到同一个字符上，相同字符只能映射到同一个字符上，字符可以映射到自己本身。
 * --------------------------------------------------
 * 提示：
 * 可以假设 s 和 t 长度相同。
 */