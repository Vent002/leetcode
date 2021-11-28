package cn.hsmxg1204.learnday39;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author gxming
 * @Description 438. 找到字符串中所有字母异位词
 * @CreateTime 2021-11-28 11:57
 */
public class FindAnagrams {
    /**
     * 使用双指针
     * @param s 被查找字串
     * @param p 目标字串
     * @return
     */
    public static List<Integer> findAnagrams(String s,String p){
        int length = p.length();
        int sLen = s.length();
        char[] chars = p.toCharArray();
        List<Integer> res = new ArrayList<>();
        if(length > sLen){
            return res;
        }
        // 快 p.length() 步
        // 若该字符串是p的异位字符，那么将首字母的index添加到res
        // 若不是，那么快指针加 1，尾指针加 1，直到s的尾
        // 尾指针
        int headIndex = 0;
        int backIndex = length;

        char[] sChars = s.toCharArray();

        while(headIndex != sLen){
            int count = 0,counter = 0;
            HashMap<Character,Integer> map = new HashMap<>();
            for (int i = headIndex; i < backIndex; i++) {
                map.put(sChars[i],map.getOrDefault(sChars[i],0)+1);
            }
            for (int i = headIndex; i < backIndex; i++) {
                if(map.containsKey(chars[counter]) ){

                    Integer integer = map.get(chars[counter]);
                    if(integer > 0){
                        integer--;
                        map.put(chars[counter],integer);
                        count++;
                    }
                }
                counter++;
            }
            if(count == length){
                res.add(headIndex);
            }
            headIndex++;
            if(backIndex != sLen) {
                backIndex++;
            }
        }
        return res;
    }

    public static List<Integer> findAnagramsAns(String s,String p){
        int n = s.length(), m = p.length();
        List<Integer> res = new ArrayList<>();
        if(n < m) return res;

        int[] pCnt = new int[26];
        int[] sCnt = new int[26];

        for(int i = 0; i < m; i++){
            pCnt[p.charAt(i) - 'a'] ++;
        }

        int left = 0;
        for(int right = 0; right < n; right++){
            int curRight = s.charAt(right) - 'a';
            sCnt[curRight]++;
            while(sCnt[curRight] > pCnt[curRight]){
                int curLeft = s.charAt(left) - 'a';
                sCnt[curLeft]--;
                left++;
            }
            if(right - left + 1 == m){
                res.add(left);
            }
        }
        return res;
    }

    public static void main(String[] args) {
      String  s = "cbaebabacd", p = "abc";

      String  s1 = "baa", p1 = "aa";
//      findAnagrams(s,p).forEach(System.out::println);
//
//      findAnagrams(s1,p1).forEach(System.out::println);

      findAnagramsAns(s,p).forEach(System.out::println);

      findAnagramsAns(s1,p1).forEach(System.out::println);
    }
}
