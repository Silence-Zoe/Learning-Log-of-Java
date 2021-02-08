class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        if (strs.length == 0 || strs == null) {
            return ans;
        }
        boolean flag = true;
        int min = strs[0].length();
        for (int i = 0; i < strs.length; i++) {
            if (min > strs[i].length()) {
                min = strs[i].length();
            }
        }
        for (int i = 0; i < min; i++) {
           for (int j = 0; flag && j < strs.length - 1; j++) {
               flag = strs[j].charAt(i) == strs[j + 1].charAt(i);
           }
           if (flag) {
               ans += strs[0].charAt(i);
           }
        }
        return ans;
    }
}