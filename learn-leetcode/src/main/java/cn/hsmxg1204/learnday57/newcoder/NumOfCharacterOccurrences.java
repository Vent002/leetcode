package cn.hsmxg1204.learnday57.newcoder;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author gxming
 * @Description 字符出现的次数
 * @CreateTime 2022-03-01 19:26
 */
public class NumOfCharacterOccurrences {

    public static int numOfCharacterOccurrences(String str,String target){
        String s = str.toUpperCase(Locale.ROOT);
        char[] chars = s.toCharArray();
        HashMap<Character,Integer> hashMap = new HashMap<>();
        for (int i = 0;i<chars.length;i++){
            hashMap.put(chars[i], hashMap.getOrDefault(chars[i],0)+1);
        }
        if(hashMap.get(target.charAt(0)) == null){
            return 0;
        }
        return  hashMap.get(target.charAt(0));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sourceStr =sc.nextLine();
        String target=sc.next().toUpperCase(Locale.ROOT);
        System.out.println(numOfCharacterOccurrences(sourceStr,target));
    }

}
