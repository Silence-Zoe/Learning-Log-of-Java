/**
 * 执行用时：20 ms，在所有 Java 提交中击败了 66.84% 的用户
 * 内存消耗：45.5 MB，在所有 Java 提交中击败了 50.84% 的用户
 */
class MyHashSet {
    private LinkedList[] bucket = new LinkedList[509];

    public MyHashSet() {
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new LinkedList<Integer>();
        }
    }
    
    public void add(int key) {
        int b = key % 509;
        if (!bucket[b].contains(key)) {
            bucket[b].add(key);
        }
    }
    
    public void remove(int key) {
        int b = key % 509;
        bucket[b].removeFirstOccurrence(key) ;
    }

    public boolean contains(int key) {
        int b = key % 509;
        return bucket[b].contains(key);
    }
}
/**
 * 不使用任何内建的哈希表库设计一个哈希集合（HashSet）。
 * 实现 MyHashSet 类：
 *     void add(key) 向哈希集合中插入值 key 。
 *     bool contains(key) 返回哈希集合中是否存在这个值 key 。
 *     void remove(key) 将给定值 key 从哈希集合中删除。如果哈希集合中没有这个值，什么也不做。
 * --------------------------------------------------
 * 提示：
 * 0 <= key <= 10^6
 * 最多调用 10^4 次 add、remove 和 contains 。
 */