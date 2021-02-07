class Solution {
    public int pivotIndex(int[] nums) {
        int sum1 = 0;
        int sum2;
        for (int i = 0; i < nums.length; i++) {
            sum1 += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            sum2 = 0;
            for (int j = 0; j < i; j++) {
                sum2 += nums[j];
            }
            if (sum1 - nums[i] - sum2 == sum2) {
                return i;
            }
        }
        return -1;
    }
}