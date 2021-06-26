package cn.hsmxg1204.learnday02.longestPalindromic;

/**
 * TODO
 *
 * @author gxming
 * @description 给定⼀个字符串，输出最⻓的回⽂⼦串。
 * 回⽂串指的是正的读和反的读是⼀样的字符串，例如
 * "aba"，"ccbbcc"。
 * @date 2021-06-26 9:40
 */
public class Palindromic {

    public boolean isPalindrome(String s,int start,int end){
        while (start < end){
            if(s.charAt(start++) != s.charAt(end--)){
                return false;
            }
        }
        return true;
    }

    /**
     * 暴力破解 找出所有字串，判断是否是回文串，然后找最长的回文串
     * @param str 字符串
     * @param n 字符串长度
     * @return
     */
    public int getLongestPalindrome(String str,int n){
        if(n < 2){
            return str.length();
        }
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(isPalindrome(str,i,j)){
                    if(maxLen < j - i + 1){
                        maxLen = j - i + 1;
                    }
                }
            }
        }
        return maxLen;
    }

    /**
     * 马拉车算法
     */
    public static String preProcess(String str){
        int n = str.length();
        if(n == 0){
            return "^$";
        }
        StringBuilder ret = new StringBuilder("^");
        for (int i = 0; i < n; i++) {
            ret.append("#").append(str.charAt(i));
        }
        ret.append("#$");
        return ret.toString();
    }

    public static String longestPalindrome(String s){
        String str = preProcess(s);
        int n = str.length();
        int[] newStr = new int[n];
        int left = 0,right = 0;
        for (int i = 1; i < n - 1; i++) {
            int i_mrrior = 2 * left - i;
            System.out.println(i_mrrior);
            if(right > i){
                newStr[i] = Math.min(right - i,newStr[i_mrrior]);
            }else{
                newStr[i] = 0;
            }

            while(str.charAt(i + 1 + newStr[i]) == str.charAt(i - 1 - newStr[i])){
                newStr[i]++;
            }

            if(i + newStr[i] > right){
                left = i;
                right = i + newStr[i];
            }
        }
        int maxLen = 0;
        int centerIndex = 0;
        for (int i = 0; i < n - 1; i++) {
            if (newStr[i] > maxLen){
                maxLen = newStr[i];
                centerIndex = i;
            }
        }
        int start = (centerIndex - maxLen) / 2;
        return s.substring(start,start + maxLen);
    }

    public static void main(String[] args) {
        String str = "cbcbcbde";
        String s = longestPalindrome(str);
        System.out.println(s);
    }
}
