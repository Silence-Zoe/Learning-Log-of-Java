class Solution {
    public void moveZeroes(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length - cnt; i++) {
            while (nums[i] == 0 && cnt < nums.length) {
                int j;
                for (j = i; j < nums.length - cnt - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[j] = 0;
                cnt++;
            }
        }
    }
}