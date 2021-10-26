package cn.hsmxg1204.learnday14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TODO
 *
 * @author gxming
 * @description 给定一个大小为 n 的整数数组，找出其中所有出现超过 ⌊ n/3 ⌋ 次的元素。
 * @date 2021-10-22 8:51
 */
public class MajorityElement {

    private static Map<Integer, Integer> countNums(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 1);
            } else {
                counts.put(num, counts.get(num) + 1);
            }
        }
        return counts;
    }

    public static List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> counts = countNums(nums);
        List<Integer> list = new ArrayList<>();
        Map.Entry<Integer, Integer> majorityEntry = null;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > ((nums.length)/3)) {
                majorityEntry = entry;
                list.add(majorityEntry.getKey());
                majorityEntry = null;
            }
        }

        return list;
    }

    public static void main(String[] args) {
//        String value ="3029515";
//        int count = 10 - value.length();
//        String resultStr = "";
//        if (count > 0) {
//            for (int i = 0; i < count; i++) {
//                resultStr += "0";
//            }
//            System.out.println( resultStr += value );
//        }
//        System.out.println(value);

        int[] nums = {1,1,1,3,3,2,2,2};
        System.out.println(majorityElement(nums));
    }
}
