package cn.hsmxg1204.learnday41;

/**
 * TODO
 *
 * @author gxming
 * @description 400. 第 N 位数字
 * 给你一个整数 n ，请你在无限的整数序列 [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...] 中找出并返回第 n 位数字。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：n = 3
 * 输出：3
 * 示例 2：
 *
 * 输入：n = 11
 * 输出：0
 * 解释：第 11 位数字在序列 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ... 里是 0 ，它是 10 的一部分。
 *  
 *
 * 提示：
 *
 * 1 <= n <= 2^31 - 1
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/nth-digit
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021-11-30 13:15
 */
public class FindNthDigit {
    public static int findNthDigit(int n){
        if(n < 10) return n;

        long length =0;
        // 一位数有9个，二位数有90个，三位数有900个...
        long cnt = 9;
        // 当前数有多少位
        int i = 1;

        for (; length + cnt * i < n;++i){
            length += cnt * i;
            cnt *= 10;
        }
        // 若用double 会产生进制问题
        long num = (long) (Math.pow(10,i-1) + (n - length -1) / i);
        long index = (n - length - 1) % i;
        char c = String.valueOf(num).charAt((int) index);
        return c-'0';
    }

    public static void main(String[] args) {
        int nthDigit = findNthDigit(999999999);
        System.out.println(nthDigit);
    }
}
