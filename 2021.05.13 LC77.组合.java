/**
 * 执行用时：106 ms，在所有 Java 提交中击败了 5.00% 的用户
 * 内存消耗：39.7 MB，在所有 Java 提交中击败了 74.37% 的用户
 */
class Solution {
    private List<List<Integer>> ans = new ArrayList<>();
    private List<Integer> com = new ArrayList<>();
    
    public List<List<Integer>> combine(int n, int k) {
        backTracing(n, k, 1);
        return ans;
    }

    void backTracing(int n, int k, int ind) {
        if (com.size() == k) {
            ans.add(new ArrayList<Integer>(com));
            return;
        }
        
        for (int i = ind; i <= n; i++) {
            com.add(i);
            backTracing(n, k, i + 1);
            com.remove(new Integer(i));
        }
    }
}
/**
 * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
 */