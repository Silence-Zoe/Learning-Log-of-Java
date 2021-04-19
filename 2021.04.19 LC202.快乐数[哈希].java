/**
 * 执行用时：1 ms，在所有 Java 提交中击败了 99.73% 的用户
 * 内存消耗：35.2 MB，在所有 Java 提交中击败了 90.02% 的用户
 */
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> hs = new HashSet<>();
        while(true) {
            int x = n;
            if (n == 1) {
                    return true;
            }
            if (!hs.add(n)) {
                return false;
            }

            n = 0;
            while (x > 0) {
                n += (x % 10) * (x % 10);
                x /= 10;
            }
        }
    }
}
/**
 * 编写一个算法来判断一个数 n 是不是快乐数。
 * 「快乐数」定义为：
 *     对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和。
 *     然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。
 *     如果 可以变为  1，那么这个数就是快乐数。
 * 如果 n 是快乐数就返回 true ；不是，则返回 false 。
 * --------------------------------------------------
 * 提示：
 * 1 <= n <= 2^31 - 1
 */