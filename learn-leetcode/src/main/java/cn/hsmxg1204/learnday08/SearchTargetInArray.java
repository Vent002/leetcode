package cn.hsmxg1204.learnday08;

/**
 * TODO Search in Rotated Sorted Array
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 * You may assume no duplicate exists in the array
 * @author gxming
 * @description
 * @date 2021-07-17 11:03
 *
 * first
 *
 */
public class SearchTargetInArray {
    public static int search(int[] nums,int target){
        int first = 0,last = nums.length;
        while (first != last){
            int mid = first + (last - first) / 2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] >= nums[first]){
                if(nums[first] <= target && target < nums[mid] ) {
                    last = mid;
                }
                else {
                    first = mid + 1;
                }
            }else{
                if(nums[mid] < target && target <= nums[last - 1]) {
                    first = mid - 1;
                }
                else {
                    last = mid;
                }
            }
        }
        return -1;
    }
}
