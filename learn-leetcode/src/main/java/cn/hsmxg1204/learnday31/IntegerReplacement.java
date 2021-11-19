package cn.hsmxg1204.learnday31;

/**
 * TODO
 *
 * @author gxming
 * @description
 * @date 2021-11-19 16:02
 */
public class IntegerReplacement {

    public static int integerReplacement(int n) {
        int count = 0;
        if (n == 1) {
            return 0;
        }
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
                count++;
            } else {
                if ((n + 1) % 4 == 0) {
                    n = n + 1;
                } else {
                    n = n - 1;
                }
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(integerReplacement(65535));

        System.out.println(integerReplacement(7));
    }
}
