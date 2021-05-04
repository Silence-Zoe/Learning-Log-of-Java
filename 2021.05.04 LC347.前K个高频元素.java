/**
 * 执行用时：16 ms，在所有 Java 提交中击败了 54.25% 的用户
 * 内存消耗：41.1 MB，在所有 Java 提交中击败了 42.91% 的用户
 */
import java.util.Map.Entry;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int x : nums) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = 
        new ArrayList<Map.Entry<Integer, Integer>>(hm.entrySet());
		
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				return o2.getValue().compareTo(o1.getValue());
			}
        });

        int cnt = 0;
        for (Map.Entry<Integer, Integer> map : list) {
            if (cnt == k) {
                break;
            }
            ans[cnt++] = map.getKey();
        }
        
        return ans;
    }
}
/**
 * 给你一个整数数组 nums 和一个整数 k ，请你返回其中出现频率前 k 高的元素。你可以按 任意顺序 返回答案。
 * --------------------------------------------------
 * 提示：
 * 1 <= nums.length <= 10^5
 * k 的取值范围是 [1, 数组中不相同的元素的个数]
 * 题目数据保证答案唯一，换句话说，数组中前 k 个高频元素的集合是唯一的
 */