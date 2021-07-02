/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：38.9 MB，在所有 Java 提交中击败了 44.17% 的用户
 */
class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (key == root.val) {
            if (root.left == null && root.right == null) {
                return null;
            } else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                TreeNode pre = root.right;
                TreeNode t = pre.left;
                if (t == null) {
                    pre.left = root.left;
                    return pre;
                }

                while(t.left != null) {
                    pre = pre.left;
                    t = t.left;
                }

                pre.left = t.right;
                t.left = root.left;
                t.right = root.right;
                return t;
            }
        }

        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        }
        if (root.val < key) {
            root.right = deleteNode(root.right, key);
        }
        return root;
    }
}
/**
 * 给定一个二叉搜索树的根节点 root 和一个值 key，删除二叉搜索树中的 key 对应的节点，并保证二叉搜索树的性质不变。返回二叉搜索树（有可能被更新）的根节点的引用。
 * 一般来说，删除节点可分为两个步骤：
 *     首先找到需要删除的节点；
 *     如果找到了，删除它。
 * --------------------------------------------------
 * 提示：
 * 给定的树上的节点数介于 0 和 10^4 之间
 * 每个节点都有一个唯一整数值，取值范围从 -10^5 到 10^5
 * -10^5 <= key <= 10^5
 */