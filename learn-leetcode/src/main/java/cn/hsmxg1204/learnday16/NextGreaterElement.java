package cn.hsmxg1204.learnday16;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * TODO
 *
 * @author gxming
 * @description
 * @date 2021-10-26 9:21
 */
public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] nums1,int[] nums2){
        int[] result = new int[nums1.length];
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i],i);
        }
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(map.get(nums1[i]));
            if(map.get(nums1[i]) + 1 == nums2.length){
                result[i] = -1;
            }
            for (int j = map.get(nums1[i]) + 1; j < nums2.length; j++) {
                if(nums2[j] > nums1[i]){
                    result[i] = nums2[j];
                    break;
                }else{
                    result[i] = -1;
                }
            }
        }
//        for (int i = 0; i < nums1.length; i++) {
//            for (int k : nums2) {
//                if (k > nums1[i]) {
//                    result[i] = k;
//                    break;
//                } else {
//                    result[i] = -1;
//                }
//            }
//        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] nums3 = {2,4};
        int[] nums4 = {1,2,3,4};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
        System.out.println(Arrays.toString(nextGreaterElement(nums3, nums4)));
    }
}
