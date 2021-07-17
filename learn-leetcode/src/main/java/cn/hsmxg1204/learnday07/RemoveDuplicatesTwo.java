package cn.hsmxg1204.learnday07;

/**
 * TODO Remove Duplicates from Sorted Array II
 * Follow up for ”Remove Duplicates”: What if duplicates are allowed at most twice?
 * For example, Given sorted array A = [1,1,1,2,2,3],
 * Your function should return length = 5, and A is now [1,1,2,2,3]
 *
 * @author gxming
 * @description
 * @date 2021-07-17 9:43
 */
public class RemoveDuplicatesTwo {
    public static int removeDuplicatesTwo(int[] nums){
        if(nums.length <= 2){
            return nums.length;
        }
        int index = 2;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != nums[index - 2]){
                nums[index++] = nums[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(removeDuplicatesTwo(nums));
    }
}
