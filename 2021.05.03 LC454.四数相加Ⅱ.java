/**
 * 执行用时：181 ms，在所有 Java 提交中击败了 7.40% 的用户
 * 内存消耗：38.5 MB，在所有 Java 提交中击败了 93.72% 的用户
 */
class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> hm12 = new HashMap<>();
        HashMap<Integer, Integer> hm34 = new HashMap<>();

        int n = nums1.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                hm12.put(nums1[i] + nums2[j], hm12.getOrDefault(nums1[i] + nums2[j], 0) + 1);
                hm34.put(nums3[i] + nums4[j], hm34.getOrDefault(nums3[i] + nums4[j], 0) + 1);
            }
        }

        int ans = 0;
        for (Integer key : hm12.keySet()) {
            if (hm34.containsKey(-key)) {
                ans += hm12.get(key) * hm34.get(-key);
            }
        }

        return ans;
    }
}
/**
 * 给定四个包含整数的数组列表 A , B , C , D ,计算有多少个元组 (i, j, k, l) ，使得 A[i] + B[j] + C[k] + D[l] = 0。
 * 为了使问题简单化，所有的 A, B, C, D 具有相同的长度 N，且 0 ≤ N ≤ 500 。所有整数的范围在 -2^28 到 2^28 - 1 之间，最终结果不会超过 2^31 - 1 。
 */