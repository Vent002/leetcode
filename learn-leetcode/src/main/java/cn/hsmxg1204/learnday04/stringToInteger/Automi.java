package cn.hsmxg1204.learnday04.stringToInteger;

/**
 * TODO implement <span>atoi</span> which converts a string to an integer
 *
 * @author gxming
 * @description
 * @date 2021-06-30 8:35
 */
public class Automi {
    public static Integer stringToInt(String s){
        int sign = 1;
        int ans = 0,pop = 0;
        // 判断是否要转换为数字
        boolean hasSign = false;
        for (int i = 0; i < s.length(); i++) {
            // 如果 开始有 +、空格、-三种字符 ，之后的数据开始转换为数字
            if(s.charAt(i) == '-' && !hasSign){
                sign = -1;
                hasSign = true;
                continue;
            }
            if(s.charAt(i) == '+' && !hasSign){
                sign = 1;
                hasSign = true;
                continue;
            }
            if(s.charAt(i) == ' ' && !hasSign){
                continue;
            }
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                hasSign = true;
                pop = s.charAt(i) - '0';
                if(ans * sign > Integer.MAX_VALUE / 10 || (ans * sign == Integer.MAX_VALUE / 10 && pop * sign > 7)) return 2147483647;
                if(ans * sign < Integer.MIN_VALUE / 10 || (ans * sign == Integer.MIN_VALUE / 10 && pop * sign< -8)) return -2147483648;
                ans = ans * 10 + pop;
            }else{
                return ans * sign;
            }
        }
        return  ans * sign;
    }

    public static void main(String[] args) {
        System.out.println(stringToInt("42"));
        System.out.println(stringToInt("     -42"));
        System.out.println(stringToInt("4193 with words"));
        System.out.println(stringToInt("words and 987"));
        System.out.println(stringToInt("-91283472332"));
    }

}
