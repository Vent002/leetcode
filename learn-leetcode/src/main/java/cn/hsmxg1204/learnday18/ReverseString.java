package cn.hsmxg1204.learnday18;

import java.util.Arrays;

/**
 * TODO
 *
 * @author gxming
 * @description 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 s 的形式给出。
 * <p>
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 * 示例 1：
 * <p>
 * 输入：s = ["h","e","l","l","o"]
 * 输出：["o","l","l","e","h"]
 * 示例 2：
 * <p>
 * 输入：s = ["H","a","n","n","a","h"]
 * 输出：["h","a","n","n","a","H"]
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= s.length <= 10^5
 * s[i] 都是 ASCII 码表中的可打印字符
 * @date 2021-10-29 9:21
 */
public class ReverseString {
    public static void reverseString(char[] s) {
        int startIndex = 0;
        int endIndex = s.length - 1;
        while (startIndex < endIndex) {
            char temp = s[startIndex];
            s[startIndex] = s[endIndex];
            s[endIndex] = temp;
            startIndex++;
            endIndex--;
        }
        System.out.println(Arrays.toString(s).toCharArray());
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        char[] s1 = {'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString(s);
        reverseString(s1);
//        reverseStrings(s);
//        reverseStrings(s1);
    }

//    public static void reverseStrings(char[] s) {
//        if (s == null || s.length == 0) return;
//        reverseStringHelper(s,0,s.length - 1);
//
//        System.out.println(Arrays.toString(s).toCharArray());
//    }
//
//    public static void reverseStringHelper(char[] s, int left, int right) {
//        if (left >= right) return;
//        swapChar(s,left,right);
//        reverseStringHelper(s,++left,--right);
//    }
//
//    public static void swapChar(char[] array, int i, int j) {
//        char temp = array[i];
//        array[i] = array[j];
//        array[j] = temp;
//    }
}
