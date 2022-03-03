package cn.hsmxg1204.learnday57.newcoder;

import java.util.Scanner;

/**
 * @Author gxming
 * @Description 变形的杨辉三角
 * 第一行只有一个数1，以下每行的每个数，是恰好是它上面的数、左上角数和右上角的数，3个数之和（如果不存在某个数，认为该数就是0）。
 * 求第n行第一个偶数出现的位置。如果没有偶数，则输出-1。例如输入3,则输出2，输入4则输出3。
 * 数据范围：
 * 1 ≤ n ≤10^9
 *
 * 1≤n≤10^9
 *
 * 本题有多组输入数据
 * 输入描述：
 *
 * 输入一个int整数
 * 输出描述：
 *
 * 输出返回的int值
 * @CreateTime 2022-03-01 20:52
 */
public class TransformTri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            if(num == 1 || num == 2){
                System.out.println(-1);
            }else if(num % 4 == 0){
                System.out.println(2);
            }else if(num % 4 == 2){
                System.out.println(4);
            }else{
                System.out.println(3);
            }
        }
    }
}
