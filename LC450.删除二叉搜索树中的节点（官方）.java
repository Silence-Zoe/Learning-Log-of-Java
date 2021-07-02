/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：39.1 MB，在所有 Java 提交中击败了 6.61% 的用户
 */
class Solution {
    public int successor(TreeNode root) {
        root = root.right;
        while (root.left != null) {
            root = root.left;
        }
        return root.val;
    }

    public int predecessor(TreeNode root) {root = root.left;
        while (root.right != null) {
            root = root.right;
        }
        return root.val;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else {
            if (root.left == null && root.right == null) {
                root = null;
            } else if (root.right != null) {
                root.val = successor(root);
                root.right = deleteNode(root.right, root.val);
            } else {
                root.val = predecessor(root);
                root.left = deleteNode(root.left, root.val);
            }
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