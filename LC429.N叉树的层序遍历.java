/**
 * 执行用时：4 ms，在所有 Java 提交中击败了 55.48% 的用户
 * 内存消耗：39.6 MB，在所有 Java 提交中击败了 9.57% 的用户
 */
class Solution {
    private List<List<Integer>> ret = new ArrayList<>();
    private List<Integer> lay = new ArrayList<>();
    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) {
            return ret;
        }
        Deque<Node> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node t = q.poll();
                lay.add(t.val);
                List c = t.children;
                for (int j = 0; j < c.size(); j++) {
                    q.offer((Node)c.get(j));
                }
            }
            ret.add(new ArrayList(lay));
            lay.clear();
        }

        return ret;
    }
}
/**
 * 给定一个 N 叉树，返回其节点值的层序遍历。（即从左到右，逐层遍历）。
 * 树的序列化输入是用层序遍历，每组子节点都由 null 值分隔。
 * --------------------------------------------------
 * 提示：
 * 树的高度不会超过 1000
 * 树的节点总数在 [0, 10^4] 之间
 */
