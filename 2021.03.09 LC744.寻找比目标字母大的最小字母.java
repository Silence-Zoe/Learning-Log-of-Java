/**
 * 执行用时：0 ms，在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗：38.7 MB，在所有 Java 提交中击败了 68.50% 的用户
 */
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length - 1;
        if (target >= letters[letters.length - 1] || target < letters[0]) {
            return letters[0];
        }
        while (left < right) {
            int m = left + (right - left) / 2;
            if (letters[m] > target) {
                right = m;
            } else {
                left = m + 1;
            }
        }
        return letters[left];
    }
}
/**
 * 给你一个排序后的字符列表 letters ，列表中只包含小写英文字母。另给出一个目标字母 target，请你寻找在这一有序列表里比目标字母大的最小字母。
 * 在比较时，字母是依序循环出现的。举个例子：
 * 如果目标字母 target = 'z' 并且字符列表为 letters = ['a', 'b']，则答案返回 'a'
 * --------------------------------------------------
 * 提示：
 * letters长度范围在[2, 10000]区间内。
 * letters 仅由小写字母组成，最少包含两个不同的字母。
 * 目标字母target 是一个小写字母。
 */