package cn.hsmxg1204.learnday56;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author gxming
 * @Description
 * @CreateTime 2022-02-12 18:18
 */
public class findMaxChar {

    public static char findMaxCountChar(String s){
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character ch : chars){
            map.put(ch,map.getOrDefault(ch,0)+ 1);
        }
        int max = 0;
        Character res = (char) 0;
        for (Map.Entry<Character,Integer>  entry: map.entrySet()){
            int cur = entry.getValue();
            if(max < cur){
                res = entry.getKey();
                max = cur;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "aaabbbbbbbbsssssasaaasdasdasdaaaaa";
        char c = findMaxCountChar(s);
        System.out.println(c);
    }
}
