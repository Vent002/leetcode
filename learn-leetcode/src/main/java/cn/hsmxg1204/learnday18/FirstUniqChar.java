package cn.hsmxg1204.learnday18;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author gxming
 * @description
 *  给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 *
 *  
 *
 * 示例：
 *
 * s = "leetcode"
 * 返回 0
 *
 * s = "loveleetcode"
 * 返回 2
 *  
 *
 * 提示：你可以假定该字符串只包含小写字母。
 *
 * @date 2021-10-29 9:36
 */
public class FirstUniqChar {
    public static int firstUniqChar(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for(char c : chars){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for (int i = 0; i < s.length(); i++) {
            if(map.get(chars[i]) == 1){
                return i;
            }
        }
        return -1;
    }

    /**
     * 有26个小写字母，定义了一个length为26的数组，下标0-25，
     * 每个字母对应一个，根据ASCII值计算，a~z对应97~122，a则为a-a即为0，z则为z-a即为25，a-z之间的也一一对应。
     *
     * @param s
     * @return
     */
    public static int firstUniqCharOfOwn(String s) {
        int[] count = new int[26];
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            count[chars[i] - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (count[chars[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        String s1 ="loveleetcode";
        System.out.println(firstUniqChar(s));
        System.out.println(firstUniqChar(s1));
        System.out.println(firstUniqCharOfOwn(s1));
        System.out.println(firstUniqCharOfOwn(s));
    }


}
