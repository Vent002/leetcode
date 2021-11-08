package cn.hsmxg1204.learnday26;

import java.util.Arrays;

/**
 * TODO
 *
 * @author gxming
 * @description
 * @date 2021-11-08 10:39
 */
public class ReverseWords {

    public static String reverseWords(String s){
        char[] chars = s.toCharArray();
        int n = chars.length;
        int left = 0; int right = 0;
        while (right <= n){
            if(right == n || chars[right] == ' '){
                reverseString(chars,left,right-1);
                left = right + 1;
            }
            right++;
        }
        return new String(chars);
    }

    public static String reverseString(char[] s,int startIndex, int endIndex){
        while (startIndex < endIndex) {
            char temp = s[startIndex];
            s[startIndex] = s[endIndex];
            s[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
        return Arrays.toString(s);
    }

    public String reverseWordsV2(String s) {
        String[] strs = s.split(" ");
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < strs.length; i++) {
            buffer.append(new StringBuffer(strs[i]).reverse().toString());
            buffer.append(" ");
        }
        return buffer.toString().trim();
    }
    public static void main(String[] args) {
        String s ="Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
