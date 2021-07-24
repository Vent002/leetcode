package cn.hsmxg1204.learnday10;

/**
 * TODO 消除数组指定元素，并返回新数组大小
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * The order of elements can be changed. It doesn’t matter what you leave beyond the new length.
 *
 * @author gxming
 * @description
 * @date 2021-07-24 14:25
 */
public class RemoveElement {
    public static int removeElement(int[] nums, int target){
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[flag] = nums[i];
            if(nums[i] != target){
                flag++;
            }else if(nums[i] == target){
                continue;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int i = removeElement(nums, 2);
        System.out.println(i);
    }
}
