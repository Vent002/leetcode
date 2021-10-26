package cn.hsmxg1204.learnday11;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/**
 * TODO
 *
 * @author gxming
 * @description
 * @date 2021-10-18 15:19
 */
public class SingleNumber {
    public static int singleNum(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int j = 1;
            if(map.containsKey(nums[i])) {
                map.replace(nums[i],++j);
            } else{
                map.put(nums[i],j);
            }
        }
        int result = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            Integer integer = entry.getValue();
            if(integer == 1){
                result = entry.getKey();
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int nums[] = {4,1,2,1,2};
        int result = singleNum(nums);
        System.out.println(result);
    }
}
