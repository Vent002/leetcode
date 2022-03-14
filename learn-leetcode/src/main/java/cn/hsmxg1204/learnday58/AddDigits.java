package cn.hsmxg1204.learnday58;

/**
 * @Author gxming
 * @Description 各位相加
 * 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。返回这个结果。
 * @CreateTime 2022-03-03 09:38
 */
public class AddDigits {
    public static int addDigits(int num){
        return (num - 1) % 9 + 1;
    }

    public static void main(String[] args) {
        System.out.println(addDigits(38));
    }
}
