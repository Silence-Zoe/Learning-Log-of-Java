class Solution {
    public String reverseStr(String s, int k) {
        char[] str = s.toCharArray();
        int i, l, r;
        i = l = r = 0;
        for (i = 0; i < str.length - k; i += 2 * k) {
            for (l = i, r = i + k - 1; l <= r; l++, r--) {
                char t = str[l];
                str[l] = str[r];
                str[r] = t;
            }
        }
        if (str.length - i <= k) {
            for (l = i, r = str.length - 1; l <= r; l++, r--) {
                char t = str[l];
                str[l] = str[r];
                str[r] = t;
            }
        }
        return new String(str);
    }
}