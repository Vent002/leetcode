package cn.hsmxg1204.learnday51;

/**
 * TODO
 *
 * @author gxming
 * @description 28. 实现 strStr()
 * @date 2021-12-22 9:01
 */
public class StrStr {
    /**
     * KMP 算法
     * @param haystack
     * @param needle
     * @return
     */
    public static int strStr(String haystack,String needle){
        int val1 = haystack.length(),val2 = needle.length();
        if(val2 == 0){
            return 0;
        }
        int[] pi = new int[val2];
        for (int i = 1,j = 0; i < val2; i++) {
            while(j > 0 && needle.charAt(i) != needle.charAt(j)){
                j = pi[j - 1];
            }
            if(needle.charAt(i) == needle.charAt(j)){
                j++;
            }
            pi[i] = j;
        }
        for (int i = 0,j = 0; i < val1; i++) {
            while (j > 0 && haystack.charAt(i) != needle.charAt(j)){
                j = pi[j - 1];
            }
            if(haystack.charAt(i) == needle.charAt(j)){
                j++;
            }
            if(j == val2){
                return i - val2 + 1;
            }
        }
        return -1;
    }
}
