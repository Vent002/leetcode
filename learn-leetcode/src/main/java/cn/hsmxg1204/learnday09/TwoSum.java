package cn.hsmxg1204.learnday09;

import java.util.Arrays;
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
    /**
     * hashMap
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put( nums[i], i );
        }
        for (int i = 0; i < nums.length; i++) {
            int sub = target - nums[i];
            if(map.containsKey(sub) && map.get(sub) != i){
                return new int[]{i, map.get(sub)};
            }
            map.put(nums[i], i );
        }
        throw new IllegalArgumentException("1111111");
    }

    /**
     * 双指针
     * @param numbers
     * @param target
     * @return
     */
    public static int[] twoSumV2(int[] numbers, int target){
        for (int i = 0,j = numbers.length - 1; i < j ; ) {
            int sum = numbers[i] + numbers[j];
            if(sum == target){ return new int[]{i+1,j+1};}
            else if(sum > target){ j--;}
            else {i++;}
        }
        return null;
    }

    public int[] twoSumV3(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int sub = target - nums[i];
            if(map.containsKey(sub)){
                res[0] = map.get(sub);
                res[1] = i;
                return res;
            }
            map.put(nums[i], i );
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
        System.out.println(Arrays.toString(twoSumV2(nums, 9)));
    }
}
