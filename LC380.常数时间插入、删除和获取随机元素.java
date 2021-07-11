/**
 * 执行用时：131 ms，在所有 Java 提交中击败了 11.38% 的用户
 * 内存消耗：43.3 MB，在所有 Java 提交中击败了 65.75% 的用户
 */
class RandomizedSet {
    Set<Integer> hs = new HashSet<>();
    
    public RandomizedSet() {}
    
    public boolean insert(int val) {
        return hs.add(val);
    }
    
    public boolean remove(int val) {
        return hs.remove(val);
    }
    
    public int getRandom() {
        int r = (int)(Math.random() * hs.size());
        int cnt = 0;
        for (Integer x : hs) {
            if (cnt == r) {
                return x;
            }
            cnt++;
        }
        return -1;       
    }
}
/**
 * 设计一个支持在平均 时间复杂度 O(1) 下，执行以下操作的数据结构。
 *     insert(val)：当元素 val 不存在时，向集合中插入该项。
 *     remove(val)：元素 val 存在时，从集合中移除该项。
 *     getRandom：随机返回现有集合中的一项。每个元素应该有相同的概率被返回。
 */
