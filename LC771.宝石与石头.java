/**
 * 执行用时：2 ms，在所有 Java 提交中击败了 42.22% 的用户
 * 内存消耗：36.9 MB，在所有 Java 提交中击败了 33.71% 的用户
 */
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jew = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            jew.add(jewels.charAt(i));
        }
        int ans = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jew.contains(stones.charAt(i))) {
                ans++;
            }
        }
        return ans;
    }
}
/**
 * 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 * --------------------------------------------------
 * 提示：
 * S 和 J 最多含有50个字母。
 * J 中的字符不重复。
 */
