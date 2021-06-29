package cn.hsmxg1204.learnday03;

/**
 * TODO 倒置整数
 *
 * @author gxming
 * @description 主要考虑Integer的取值范围
 * @date 2021-06-29 15:08
 */
public class IntegeReverse {
    /**
     * Integer.MAX_VALUE = 2147483647
     * Integer.MIN_VALUE = -2147483648
     *
     *  时间复杂度 o(log(x))
     *  空间复杂度 o(1)
     *
     * @param x
     * @return
     */
    public static int reverse(int x){
        int temp = 0;
        while ( x != 0){
            // 个位
            int pop = x % 10;
            x /= 10;
            if(temp > Integer.MAX_VALUE / 10) return 0;
            if(temp < Integer.MIN_VALUE / 10) return 0;
            temp = temp * 10 + pop;
        }
        return temp;
    }

    public static void main(String[] args) {
        int x = 1534266469;
        System.out.println(reverse(x));

        int y = 5986;
        System.out.println(reverse(y));
    }

}
