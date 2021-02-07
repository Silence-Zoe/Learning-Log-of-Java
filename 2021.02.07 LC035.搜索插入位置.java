class Solution {
    public int searchInsert(int[] nums, int target) {
        int i;
        for (i = 0; i < nums.length && target > nums[i]; i++) {
            ;
        }
        return i;
    }
}