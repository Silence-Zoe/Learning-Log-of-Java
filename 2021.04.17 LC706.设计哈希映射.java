/**
 * 执行用时：25 ms，在所有 Java 提交中击败了 60.38% 的用户
 * 内存消耗：43.1 MB，在所有 Java 提交中击败了 87.51% 的用户
 */
class MyHashMap {
    private LinkedList[] bucket = new LinkedList[509];
    private LinkedList[] val = new LinkedList[509];

    public MyHashMap() {
        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new LinkedList<Integer>();
            val[i] = new LinkedList<Integer>();
        }
    }
    
    public void put(int key, int value) {
        int b = key % 509;
        if (!bucket[b].contains(key)) {
            bucket[b].add(key);
            val[b].add(value);
        } else {
            val[b].set(bucket[b].indexOf(key), value);
        }
    }
    
    public int get(int key) {
        int b = key % 509;
        if (!bucket[b].contains(key)) {
            return -1;
        } else {
            return (int)val[b].get(bucket[b].indexOf(key));
        }
    }
    
    public void remove(int key) {
        int b = key % 509;
        if (bucket[b].contains(key)) {
            val[b].remove(bucket[b].indexOf(key));
            bucket[b].removeFirstOccurrence(key);
        }
    }
}
/**
 * 不使用任何内建的哈希表库设计一个哈希映射（HashMap）。
 * 实现 MyHashMap 类：
 *     MyHashMap() 用空映射初始化对象
 *     void put(int key, int value) 向 HashMap 插入一个键值对 (key, value) 。如果 key 已经存在于映射中，则更新其对应的值 value 。
 *     int get(int key) 返回特定的 key 所映射的 value ；如果映射中不包含 key 的映射，返回 -1 。
 *     void remove(key) 如果映射中存在 key 的映射，则移除 key 和它所对应的 value 。
 * --------------------------------------------------
 * 提示：
 * 0 <= key, value <= 10^6
 * 最多调用 10^4 次 put、get 和 remove 方法
 */