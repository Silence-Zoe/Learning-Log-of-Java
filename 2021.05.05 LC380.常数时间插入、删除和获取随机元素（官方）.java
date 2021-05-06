/**
 * 执行用时：12 ms，在所有 Java 提交中击败了 83.56% 的用户
 * 内存消耗：43.6 MB，在所有 Java 提交中击败了 29.88% 的用户
 */
class RandomizedSet {
    Map<Integer, Integer> dict;
    List<Integer> list;
    Random rand = new Random();

    public RandomizedSet() {
        dict = new HashMap();
        list = new ArrayList();
    }

    public boolean insert(int val) {
        if (dict.containsKey(val)) {
            return false;
        }

        dict.put(val, list.size());
        list.add(list.size(), val);
        return true;
    }

    public boolean remove(int val) {
        if (! dict.containsKey(val)) {
            return false;
        }

        int lastElement = list.get(list.size() - 1);
        int idx = dict.get(val);
        list.set(idx, lastElement);
        dict.put(lastElement, idx);

        list.remove(list.size() - 1);
        dict.remove(val);
        return true;
    }

    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}
/**
 * 设计一个支持在平均 时间复杂度 O(1) 下，执行以下操作的数据结构。
 *     insert(val)：当元素 val 不存在时，向集合中插入该项。
 *     remove(val)：元素 val 存在时，从集合中移除该项。
 *     getRandom：随机返回现有集合中的一项。每个元素应该有相同的概率被返回。
 */
