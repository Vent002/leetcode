package cn.hsmxg1204.learnday09;

import java.util.HashMap;
import java.util.Map;

/**
 * TODO
 *
 * @author gxming
 * @description
 * @date 2021-07-17 16:48
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put( nums[i], i );
        }
        for (int i = 0; i < nums.length; i++) {
            int sub = target = nums[i];
            if(map.containsKey(sub) && map.get(sub) != i){
                return new int[]{i, map.get(sub)};
            }
            map.put(nums[i], i );
        }
        throw new IllegalArgumentException("1111111");
    }
}
