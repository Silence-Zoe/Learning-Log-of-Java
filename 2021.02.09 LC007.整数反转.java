class Solution {
    public int reverse(int x) {
        double ans = 0;	//使用了double来辅助检查溢出，实际上不合题意
        boolean flag = false;
        if (x < 0) {
            x = -x;
            flag = true;
        }
        ans = x % 10;
        while ((x = x / 10) != 0) {
            ans = ans * 10 + x % 10; 
        }
        if (flag) {
            ans = -ans;
        }
        if (ans < -2147483648 || ans > 2147483647) {
            return 0;
        }
        return (int) ans;
    }
}