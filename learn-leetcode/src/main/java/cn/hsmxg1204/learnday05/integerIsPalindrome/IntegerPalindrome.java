package cn.hsmxg1204.learnday05.integerIsPalindrome;

/**
 * TODO Determine whether an integer is a palindrome.
 * An integer is a palindrome when it reads the same backward as forward.
 * Example 1 :
 *  Input: 121
 *  Output: true
 *
 *  Example 2:
 *  Input: -121
 *  Output: false
 *
 *  Example 3:
 *  Input: 10
 *  Output false
 *
 *  Could you solve it without converting the integer to a string?
 *
 * @author gxming
 * @description 判断是不是回文数，负数不是回文数
 * @date 2021-07-01 13:06
 */
public class IntegerPalindrome {
    /**
     * 马拉车算法 前置调整
     * 将string 字符串拼接成 ^ 开始，期间穿插 # ，最后以 $ 符号结束；
     * 121 ^1#2#1$
     * 22 ^2#2$
     * 1 ^1$
     * @param s 需要转换的字符串
     * @return
     */
    public static String preProcess(String s){
        int length = s.length();
        if(length == 0) {
            return "^$";
        }
        StringBuilder ret = new StringBuilder("^");
        for (int i = 0; i < length; i++) {
            ret.append("#").append(s.charAt(i));
        }
        ret.append("#$");
        return ret.toString();
    }

    /**
     * 将 integer 转换为 string ,判断是不是回文数
     * @param n
     * @return
     */
    public static boolean isPalindrome(int n){
        if(n >= 0 && n <= 9){
            return true;
        }

        String s = String.valueOf(n);
        if(s.charAt(0) == '-'){
            return false;
        }

        String str = preProcess(s);
        System.out.println("s: \t"+str);
        int mid = str.length() / 2;
        int pop = 1;
        for (int i = mid; i > 1; i--) {
            if(str.charAt(mid - pop) == str.charAt(mid + pop)){
                pop ++;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        Integer ints = new Integer(2021202);

//        System.out.println(isPalindrome(ints));
//
        System.out.println(isPalindrome(131));
//
        System.out.println(isPalindrome(-121));
//
//        System.out.println(isPalindrome(1321));
//
        System.out.println(isPalindrome(1331));

    }
}
