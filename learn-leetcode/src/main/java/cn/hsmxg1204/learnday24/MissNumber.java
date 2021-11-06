package cn.hsmxg1204.learnday24;

import java.util.HashMap;

/**
 * TODO
 *
 * @author gxming
 * @description
 * @date 2021-11-06 10:50
 */
public class MissNumber {
    public static int missNumber(int[] nums){
        // hashmap
//        int length = nums.length;
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i = 0;i < length;i++){
//            map.put(i,nums[i]);
//        }
//        int result = 0;
//        for(int i = 1;i <= length; i++){
//            if(!map.containsValue(i)){
//                result =  i;
//            }
//        }
//        return result;

        // 位运算
//        int res = nums.length;
//        for (int i = 0; i < nums.length; i++) {
//            res ^= nums[i] ^ i;
//        }
//        return res;


        // 数学
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return nums.length *(nums.length + 1) / 2 - sum;

    }

    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(missNumber(nums));
    }
}
