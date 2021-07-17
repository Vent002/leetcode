package cn.hsmxg1204.learnday07;

import java.util.Arrays;

/**
 * TODO
 * Given a sorted array, remove the duplicates in place such that each element appear only once
 * and return the new length.
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * For example, Given input array A = [1,1,2],
 * Your function should return length = 2, and A is now [1,2]
 *
 * @author gxming
 * @description
 * @date 2021-07-17 9:07
 *
 *
 */
public class RemoveDuplicates {
    public static int removeDuplicates(int nums[]){
        if(nums.length == 0) return 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[index] != nums[i]){
 //             not remove the more elements
                nums[++index] = nums[i];
            }
        }
        for (int i = index + 1; i < nums.length; i++) {
            nums[i] = 0;
        }
        Arrays.stream(nums).forEach(System.out::println);
        return index+1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2};
        removeDuplicates(nums);
    }
}
