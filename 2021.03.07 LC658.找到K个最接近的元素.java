/**
 * 执行用时：5 ms，在所有 Java 提交中击败了 66.79% 的用户
 * 内存消耗：40.3 MB，在所有 Java 提交中击败了 47.55% 的用户
 */
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        if (n == 1 || n == k) {
            for (int i = 0; i < n; i++) {
                ans.add(arr[i]);
            }
            return ans;
        }
        //找到距离x最近的元素
        int left = 0, right = n - 1;
        while (left < right) {
            int m = left + (right - left) / 2;
            if (arr[m] - x >= 0) {
                right = m;
            } else {
                left = m + 1;
            }
        }
        if (left != 0) {
            left = Math.abs(arr[left] - x) < Math.abs(arr[left - 1] - x) ? left : left - 1;
            right = left;
        }

        k--;
        if (left == n - 1) {
            left -= k;
            k = 0;
        } else if (left == 0) {
            right += k;
            k = 0;
        }

        while (k > 0) {
            while (right < n - 1 && arr[right + 1] == x) {
                right++;
                k--;
                if (k == 0) {
                    break;
                }
            }

            if (right == n - 1 || left > 0 && Math.abs(arr[left - 1] - x) <= Math.abs(arr[right + 1] - x)) {
                left--;
            } else if (left == 0 || right < n - 1) {
                right++;
            }
            k--;
        }

        for (int i = left; i <= right; i++) {
            ans.add(arr[i]);
        }
        return ans;
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