package cn.hsmxg1204.learnday14;

/**
 * TODO
 *
 * @author gxming
 * @description
 * @date 2021-10-22 14:48
 */
public class Search {
    public static int search(int[] nums, int target){
        int low = 0 ,height = nums.length - 1;

        while (low <= height){
            int mid = low + ( height - low) / 2;
            if(nums[mid] > target){
                height = mid - 1;
            }else if (nums[mid] < target){
                low = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        System.out.println(search(nums,9));
    }
}
