/**
 * 执行用时：15 ms，在所有 Java 提交中击败了 14.72% 的用户
 * 内存消耗：39.2 MB，在所有 Java 提交中击败了 35.14% 的用户
 */
class Solution {
    private List<String> res = new ArrayList<>();
    private Map<String, Map<String, Integer>> hm = new HashMap<String, Map<String, Integer>>();;

    public List<String> findItinerary(List<List<String>> tickets) {
        for(List<String> t : tickets){
            Map<String, Integer> temp;
            if (hm.containsKey(t.get(0))) {
                temp = hm.get(t.get(0));
                temp.put(t.get(1), temp.getOrDefault(t.get(1), 0) + 1);
            } else {
                temp = new TreeMap<>();
                temp.put(t.get(1), 1);
            }
            hm.put(t.get(0), temp);
        }

        res.add("JFK");
        backTracking(tickets.size());
        return res;
    }
    private boolean backTracking(int ticketNum){
        if (res.size() == ticketNum + 1){
            return true;
        }
        
        String last = res.get(res.size() - 1);
        if (hm.containsKey(last)){
            for (Map.Entry<String, Integer> target : hm.get(last).entrySet()){
                int count = target.getValue();
                if (count > 0) {
                    res.add(target.getKey());
                    target.setValue(count - 1);
                    if (backTracking(ticketNum)) {
                        return true;
                    }
                    res.remove(res.size() - 1);
                    target.setValue(count);
                }
            }
        }
        return false;
    }
}
/**
 * 给定一个机票的字符串二维数组 [from, to]，子数组中的两个成员分别表示飞机出发和降落的机场地点，对该行程进行重新规划排序。所有这些机票都属于一个从 JFK（肯尼迪国际机场）出发的先生，所以该行程必须从 JFK 开始。
 * --------------------------------------------------
 * 提示：
 * 如果存在多种有效的行程，请你按字符自然排序返回最小的行程组合。例如，行程 ["JFK", "LGA"] 与 ["JFK", "LGB"] 相比就更小，排序更靠前
 * 所有的机场都用三个大写字母表示（机场代码）。
 * 假定所有机票至少存在一种合理的行程。
 * 所有的机票必须都用一次 且 只能用一次。
 */