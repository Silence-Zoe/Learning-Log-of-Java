/**
 * 执行用时：7 ms，在所有 Java 提交中击败了 67.38% 的用户
 * 内存消耗：39.8 MB，在所有 Java 提交中击败了 58.53% 的用户
 */
class Solution {
    List<Integer> temp = new ArrayList<Integer>();
    List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public List<List<Integer>> combine(int n, int k) {
        List<Integer> temp = new ArrayList<Integer>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        for (int i = 1; i <= k; ++i) {
            temp.add(i);
        }
        temp.add(n + 1);
        
        int j = 0;
        while (j < k) {
            ans.add(new ArrayList<Integer>(temp.subList(0, k)));
            j = 0;

            while (j < k && temp.get(j) + 1 == temp.get(j + 1)) {
                temp.set(j, j + 1);
                ++j;
            }
            temp.set(j, temp.get(j) + 1);
        }
        return ans;
    }
}
/**
 * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
 */