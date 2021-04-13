/**
 * 执行用时：23 ms，在所有 Java 提交中击败了 48.99% 的用户
 * 内存消耗：39.9 MB，在所有 Java 提交中击败了 94.49% 的用户
 */
public class Codec {
    private TreeNode nul = new TreeNode(1001);
    public String serialize(TreeNode root) {
        StringBuffer ans = new StringBuffer();
        Deque<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return "";
        }
        queue.offer(root);
        while (!queue.isEmpty()) {
            for (int i = 0; i < queue.size(); i++) {
                TreeNode p = queue.poll();
                if (p.val == 1001) {
                    ans.append('#');
                    ans.append(',');
                } else {
                    ans.append(String.valueOf(p.val));
                    ans.append(",");
                }

                if (p == nul) {
                    continue;
                }

                if (p.left == null) {
                    queue.offer(nul);
                } else {
                    queue.offer(p.left);
                }

                if (p.right == null) {
                    queue.offer(nul);
                } else {
                    queue.offer(p.right);
                }
            }
        }
        int l = ans.length() - 1;
        while (ans.charAt(l) == ',' || ans.charAt(l) == '#') {
            l--;
        }
        return ans.substring(0, l + 1);
    }

    public TreeNode deserialize(String data) {
        if (data == "") {
            return null;
        }
        List<Integer> arr = new ArrayList<>();
        int i;
        for (i = 0; i < data.length(); i++) {
            boolean flag = (data.charAt(i) == '-');
            int val = 0;
            if (!flag) {
                val = data.charAt(i) - '0';
            } else {
                val = data.charAt(++i) - '0';
            }
            if (data.charAt(i) == '#') {
                arr.add(1001);
                i++;
                continue;
            }
            i++;
            while (i < data.length() && data.charAt(i) != ',') {
                val = val *10 + data.charAt(i++) - '0';
            }
            if (flag) {
                val = -val;
            }
            arr.add(val);
        }

        i = 0;
        TreeNode root = new TreeNode(arr.get(i++));
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode p = queue.poll();
            if (i < arr.size() && arr.get(i) != 1001){
                p.left = new TreeNode(arr.get(i));
                queue.offer(p.left);
            }
            i++;

            if (i < arr.size() && arr.get(i) != 1001){
                p.right = new TreeNode(arr.get(i));
                queue.offer(p.right);
            }
            i++;
        }
        return root;
    }
}
/**
 * 序列化是将一个数据结构或者对象转换为连续的比特位的操作，进而可以将转换后的数据存储在一个文件或者内存中，同时也可以通过网络传输到另一个计算机环境，采取相反方式重构得到原数据。
 * 请设计一个算法来实现二叉树的序列化与反序列化。这里不限定你的序列 / 反序列化算法执行逻辑，你只需要保证一个二叉树可以被序列化为一个字符串并且将这个字符串反序列化为原始的树结构。
 * --------------------------------------------------
 * 提示：
 * 树中结点数在范围 [0, 10^4] 内
 * -1000 <= Node.val <= 1000
 */