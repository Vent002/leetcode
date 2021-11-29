package cn.hsmxg1204.learnday38;

import java.util.HashMap;

/**
 * @Author gxming
 * @Description 383. 赎金信
 * @CreateTime 2021-11-27 21:07
 */
public class CanConstruct {
    public static boolean canConstruct(String ransomName,String magazine){
        char[] names = ransomName.toCharArray();
        char[] tar = magazine.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for (char ch : tar){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (char c : names){
            if(map.containsKey(c)){
                int count = map.get(c);
                if(count > 0){
                    count--;
                    map.put(c,count);
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String ransomName = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomName, magazine));
    }
}
