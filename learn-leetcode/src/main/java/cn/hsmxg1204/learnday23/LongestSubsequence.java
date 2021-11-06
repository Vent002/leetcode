package cn.hsmxg1204.learnday23;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author gxming
 * @description
 * @date 2021-11-05 8:28
 */
public class LongestSubsequence {
    public static int longestSubsequence(int[] arr,int difference){
        Map<Integer,Integer> map=new HashMap<>();
        int max=0;
        for(int i:arr){
            map.put(i,map.getOrDefault(i-difference,0)+1);
            max=Math.max(max,map.get(i));
        }
        return max;
    }
}
