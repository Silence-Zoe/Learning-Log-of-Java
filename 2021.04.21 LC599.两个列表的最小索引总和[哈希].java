/**
 * 执行用时：17 ms，在所有 Java 提交中击败了 36.71% 的用户
 * 内存消耗：39.4 MB，在所有 Java 提交中击败了 6.89% 的用户
 */
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> hm = new HashMap<>();
        Map<String, Integer> hm1 = new HashMap<>();
        Map<String, Integer> hm2 = new HashMap<>();
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            hm1.put(list1[i], i);
        }
        for (int i = 0; i < list2.length; i++) {
            hm2.put(list2[i], i);
        }
        
        int min = 2000;
        for (int i = 0; i < list1.length; i++) {
            if (hm2.containsKey(list1[i])) {
                int sum = hm1.get(list1[i]) + hm2.get(list1[i]);
                hm.put(list1[i], sum);
                min = min < sum ? min : sum;
            }
        }
        int i = 0;
        for (Map.Entry<String, Integer> a : hm.entrySet()) {
			if (a.getValue() == min) {
                ans.add(a.getKey());
                i++;
            }
		}
        return ans.toArray(new String[i]);
    }
}
/**
 * 假设Andy和Doris想在晚餐时选择一家餐厅，并且他们都有一个表示最喜爱餐厅的列表，每个餐厅的名字用字符串表示。
 * 你需要帮助他们用最少的索引和找出他们共同喜爱的餐厅。 如果答案不止一个，则输出所有答案并且不考虑顺序。 你可以假设总是存在一个答案。
 * --------------------------------------------------
 * 提示：
 * 两个列表的长度范围都在 [1, 1000]内。
 * 两个列表中的字符串的长度将在[1，30]的范围内。
 * 下标从0开始，到列表的长度减1。
 * 两个列表都没有重复的元素。
 */