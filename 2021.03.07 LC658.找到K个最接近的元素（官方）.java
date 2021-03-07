/**
 * 执行用时：18 ms，在所有 Java 提交中击败了 23.30% 的用户
 * 内存消耗：40.2 MB，在所有 Java 提交中击败了 62.17% 的用户
 */
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ret = Arrays.stream(arr).boxed().collect(Collectors.toList());
        int n = ret.size();
        if (x <= ret.get(0)) {
            return ret.subList(0, k);
        } else if (ret.get(n - 1) <= x) {
            return ret.subList(n - k, n);
        } else {
            int index = Collections.binarySearch(ret, x);
            if (index < 0) {
                index = -index - 1;
            }
            int low = Math.max(0, index - k - 1), high = Math.min(ret.size() - 1, index + k - 1);

            while (high - low > k - 1) {
                if ((x - ret.get(low)) <= (ret.get(high) - x)) {
                    high--;
                } else if ((x - ret.get(low)) > (ret.get(high) - x)) {
                    low++;
                } else {
                    System.out.println("unhandled case: " + low + high);
                }
            }
            return ret.subList(low, high + 1);
        }
    }
}
/**
 * 给定一个排序好的数组 arr ，两个整数 k 和 x ，从数组中找到最靠近 x（两数之差最小）的 k 个数。返回的结果必须要是按升序排好的。
 * 整数 a 比整数 b 更接近 x 需要满足：
 * |a - x| < |b - x| 或者
 * |a - x| == |b - x| 且 a < b
 * --------------------------------------------------
 * 提示：
 * 数组里的每个元素与 x 的绝对值不超过 104
 * 1 <= k <= arr.length
 * 1 <= arr.length <= 104
 */