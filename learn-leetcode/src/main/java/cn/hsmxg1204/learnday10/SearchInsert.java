package cn.hsmxg1204.learnday10;

/**
 * TODO
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 请必须使用时间复杂度为 O(log n) 的算法。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/search-insert-position
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author gxming
 * @description
 * @date 2021-07-24 14:48
 */
public class SearchInsert {
    public static int searchInsert(int[] nums,int target){
        int start = 0;
        int end = nums.length;
        if(end == 0){
            return 0;
        }
        while (start < end){
            int mid = (start + end) / 2;
            if(target == nums[mid]){
                return mid;
            }else if(target < nums[mid]){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int nums[] = {1,3,5,6};
        int i = searchInsert(nums, 2);
        System.out.println(i);
    }
}
