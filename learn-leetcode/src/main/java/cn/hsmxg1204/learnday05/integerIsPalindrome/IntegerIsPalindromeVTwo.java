package cn.hsmxg1204.learnday05.integerIsPalindrome;

/**
 * TODO
 *
 * @author gxming
 * @description 不转换为String
 * @date 2021-07-03 16:19
 */
public class IntegerIsPalindromeVTwo {

    public static int reverse(int x){
        int rev = 0;
        int i = 0;
        while (x != 0){
            int pop = x % 10;
            System.out.println("第"+ i +"次 ,rev = "+rev);
            x /= 10;
            if(rev > Integer.MAX_VALUE / 10){
                return 0;
            }
            if(rev < Integer.MIN_VALUE / 10){
                return 0;
            }
            rev = rev * 10 + pop;
            i++;
        }
        return rev;
    }
    public static boolean isPalindrome(int x){
        if(x < 0){
            return false;
        }
//        int rev = reverse(x);
//        System.out.println(rev);
//        return x == rev;
        // 计算x 的长度
        int digit =(int) ( Math.log(x) / Math.log(10) + 1 );
        int revert = 0;
        int pop = 0;
        for (int i = 0; i < digit / 2; i++) {
            pop = x % 10;
            revert = revert * 10 + pop;
            x /= 10;
        }
        if(digit % 2 == 0 && x == revert){
            return true;
        }
        if(digit % 2 != 0 && x / 10 == revert){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(2));
        System.out.println(isPalindrome(-121));
    }
}
