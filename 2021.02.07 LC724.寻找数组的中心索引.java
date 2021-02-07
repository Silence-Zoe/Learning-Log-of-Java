class Solution {
    public int pivotIndex(int[] nums) {
        int sum1, sum2;
        for (int x = 0; x < nums.length; x++) {
            sum1 = 0;
            sum2 = 0;
            for (int i = 0; i < x; i++) {
                sum1 += nums[i];
            }
            for (int j = x + 1; j < nums.length; j++) {
                sum2 += nums[j];
            }
            if (sum1 == sum2) {
                return x;
            }
        }
        return -1;
    }
}