/**
 * 执行用时：122 ms，在所有 Java 提交中击败了 12.24% 的用户
 * 内存消耗：38.8 MB，在所有 Java 提交中击败了 37.89% 的用户
 */
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int j = i + (numbers.length - i) / 2;
            if (target - numbers[i] < numbers[j]) {
                for (; j > i; j--) {
                    if (numbers[i] + numbers[j] == target) {
                        return new int[]{i + 1, j + 1};
                    }
                }
            } else {
                for (; j < numbers.length; j++) {
                    if (numbers[i] + numbers[j] == target) {
                        return new int[]{i + 1, j + 1};
                    }
                }
            }
        }
        return numbers;
    }
}
/**
 * 给定一个已按照 升序排列 的整数数组 numbers ，请你从数组中找出两个数满足相加之和等于目标数 target 。
 * 函数应该以长度为 2 的整数数组的形式返回这两个数的下标值。numbers 的下标 从 1 开始计数 ，所以答案数组应当满足 1 <= answer[0] < answer[1] <= numbers.length 。
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 * --------------------------------------------------
 * 提示：
 * 2 <= numbers.length <= 3 * 104
 * -1000 <= numbers[i] <= 1000
 * numbers 按 递增顺序 排列
 * -1000 <= target <= 1000
 * 仅存在一个有效答案
 */