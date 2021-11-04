package cn.hsmxg1204.learnday22;

/**
 * TODO
 *
 * @author gxming
 * @description 给定一个 正整数 num ，编写一个函数，如果 num 是一个完全平方数，则返回 true ，否则返回 false 。
 *
 * 进阶：不要 使用任何内置的库函数，如  sqrt 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：num = 16
 * 输出：true
 * 示例 2：
 *
 * 输入：num = 14
 * 输出：false
 *
 * @date 2021-11-04 8:40
 */
public class IsPerfectSquare {
    /**
     * 分析 利用 1+3+5+7+9+…+(2n-1)=n^2，即完全平方数肯定是前n个连续奇数的和
     * @param num
     * @return
     */
    public static boolean isPerfectSquare(int num){
        int sumNum = 1;
        while(num > 0){
            num -= sumNum;
            sumNum += 2;
        }
        return num==0;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(16));

        System.out.println(isPerfectSquare(14));
    }
}
