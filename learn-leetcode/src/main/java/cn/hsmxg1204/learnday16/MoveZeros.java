package cn.hsmxg1204.learnday16;

/**
 * TODO
 *
 * @author gxming
 * @description
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * @date 2021-10-26 14:10
 */
public class MoveZeros {
    public static void moveZeros(int[] nums){
        int zeroesIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                zeroesIndex++;
            }else if (zeroesIndex != 0){
                nums[i - zeroesIndex] = nums[i];
                nums[i] = 0;
            }
        }
    }
}
