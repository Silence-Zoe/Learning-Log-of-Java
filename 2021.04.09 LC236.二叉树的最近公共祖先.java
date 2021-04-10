/**
 * 执行用时：1950 ms，在所有 Java 提交中击败了 5.62% 的用户
 * 内存消耗：40.3 MB，在所有 Java 提交中击败了 90.71% 的用户
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<Integer> level = new ArrayList<>();
        Deque<TreeNode> queue = new LinkedList<>();
        TreeNode ptr = root, ans = root;
        queue.addLast(ptr);
        while (!queue.isEmpty()) {
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                ptr = queue.removeFirst();
                if (find(ptr, p) && find(ptr, q)) {
                    ans = ptr;
                }
                if (ptr.left != null) {
                    queue.addLast(ptr.left);
                }
                if (ptr.right != null) {
                    queue.addLast(ptr.right);
                }
            }
        }
        return ans;
    }

    public boolean find(TreeNode root, TreeNode t) {
        if (root == t) {
            return true;
        }

        if (root.left == null && root.right == null) {
            return false;
        }

        if (root.left != null) {
            if (root.left == t) {
                return true;
            } else if (root.right == null) {
                return false || find(root.left, t);
            } else if (root.right != t) {
                return false || find(root.left, t) || find(root.right, t);
            } else {
                return true;
            }
        }

        if (root.right == t) {
            return true;
        } else {
            return false || find(root.right, t);
        }
    }
}
/**
 * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个节点 p、q，最近公共祖先表示为一个节点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
 * --------------------------------------------------
 * 提示：
 * 树中节点数目在范围 [2, 10^5] 内。
 * -10^9 <= Node.val <= 10^9
 * 所有 Node.val 互不相同 。
 * p != q
 * p 和 q 均存在于给定的二叉树中。
 */