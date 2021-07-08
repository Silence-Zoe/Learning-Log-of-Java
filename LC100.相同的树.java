/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：35.9 MB，在所有 Java 提交中击败了 46.54% 的用户
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        }
        
        if ((p.left == null && p.right == null) && (q.left == null && q.right == null)) {
            return p.val == q.val;
        }

        return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
/**
 * 给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同。
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。 
 * --------------------------------------------------
 * 提示：
 * 两棵树上的节点数目都在范围  [0, 100] 内
 * -10^4 <= Node.val <= 10^4
*/
