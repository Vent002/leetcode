package cn.hsmxg1204.learnday33;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author gxming
 * @Description
 * @CreateTime 2021-11-21 16:28
 */
public class ContainsDuplicates {
    /**
     * 使用hash表
     * @param nums
     * @return
     */
    public static boolean containsDuplicates(int[] nums){
        Set<Integer> set = new HashSet<Integer>();
        for(int num : nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }

    /**
     * 使用排序
     * @param nums
     * @return
     */
    public static boolean containsDuplicatesBySorted(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] nums2 = {1,2,2,3,4};
        System.out.println(containsDuplicates(nums));
        System.out.println(containsDuplicates(nums2));

        System.out.println(containsDuplicatesBySorted(nums));
        System.out.println(containsDuplicatesBySorted(nums2));
    }
}
