package cn.hsmxg1204.learnday42;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * TODO
 *
 * @author gxming
 * @description 连续字符
 * @date 2021-12-01 9:04
 */
public class MaxPower {
    public static int maxPower(String s){
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : chars){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Integer> collect = map.values().stream().sorted().collect(Collectors.toList());
        return collect.get(collect.size()-1);
    }

    /**
     * 一次遍历
     * @param s
     * @return
     */
    public static int maxPower1(String s){
        int ans = 1,cnt = 1;
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i) == s.charAt(i - 1)){
                ++cnt;
                ans = Math.max(ans,cnt);
            }else{
                cnt = 1;
            }
        }
        return ans;
    }

    public static int maxPower2(String s){
        char[] chars = s.toCharArray();
        int count = 1, max = 0;
        for (int i = 1; i < chars.length; i++) {
            count += chars[i] == chars[i - 1] ? 1 : -count + 1;
            max = Math.max(max, count);
        }
        return Math.max(max, count);
    }
    public static void main(String[] args) {
        String s = "abbcccddddeeeeedcba";
        String s1 = "leetcode";
        int i = maxPower(s);
        System.out.println(maxPower2(s1));
        System.out.println(maxPower1(s1));
        System.out.println(i);
    }
}
