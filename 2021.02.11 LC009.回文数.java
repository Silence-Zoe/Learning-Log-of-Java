class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int y = x;
        int rev = y % 10;
        while ((y = y / 10) != 0) {
            rev = rev * 10 + y % 10;
        }
        if (rev == x) {
            return true;
        }
        return false;
    }
}