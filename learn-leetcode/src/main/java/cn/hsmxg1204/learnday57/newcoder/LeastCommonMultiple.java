package cn.hsmxg1204.learnday57.newcoder;

import java.util.Scanner;

/**
 * @Author gxming
 * @Description 最小公倍数
 * a，b的最大公约数为gcd（a，b），最小公倍数的公式为：
 * lcm(a,b) = ｜a * b｜ / gcd(a,b)
 * @CreateTime 2022-03-01 20:22
 */
public class LeastCommonMultiple {
    /**
     * 欧几里得求最大公约数，根据公式ab=最小公倍数gcd(a,b)，得到最小公倍数。
     * @param a
     * @param b
     * @return
     */
    public static int leastCommonMultiple(int a, int b){
        return b == 0 ? a : leastCommonMultiple(b,a % b);
    }

    public static void main(String[] args) {
        System.out.println(5 * 7 / leastCommonMultiple(5, 7));

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println( a * b / leastCommonMultiple(a,b));
    }
}
