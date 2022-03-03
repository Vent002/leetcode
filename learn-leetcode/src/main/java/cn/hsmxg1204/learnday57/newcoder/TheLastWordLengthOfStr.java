package cn.hsmxg1204.learnday57.newcoder;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author gxming
 * @Description 字符串最后一个单词的长度
 * @CreateTime 2022-03-01 19:13
 */
public class TheLastWordLengthOfStr {

    public static int theLastWordLengthOfStr(String str){
        String[] s  = str.split(" ");
        Arrays.asList(s).forEach(System.out::println);
        String lastWord = s[s.length - 1];
        return lastWord.length();
    }

    public static void main(String[] args) {
        String s = "hello nowcoder";
        System.out.println(theLastWordLengthOfStr(s));

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String string = sc.nextLine();
            System.out.println(theLastWordLengthOfStr(string));
        }
    }
}
