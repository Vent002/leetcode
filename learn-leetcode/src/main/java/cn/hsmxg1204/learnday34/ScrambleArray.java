package cn.hsmxg1204.learnday34;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * TODO
 *
 * @author gxming
 * @description 给你一个整数数组 nums ，设计算法来打乱一个没有重复元素的数组。
 *
 * 实现 Solution class:
 *
 * Solution(int[] nums) 使用整数数组 nums 初始化对象
 * int[] reset() 重设数组到它的初始状态并返回
 * int[] shuffle() 返回数组随机打乱后的结果
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shuffle-an-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021-11-22 15:32
 */
public class ScrambleArray {
    int[] nums;
    int[] original;
    public ScrambleArray(int[] nums){
        this.nums = nums;
        this.original = new int[nums.length];
        System.arraycopy(nums,0,original,0,nums.length);
    }
    public int[] reset(){
        System.arraycopy(original,0,nums,0,nums.length);
        return nums;
    }
    public int[] shuffle(){
        int[] shuffled = new int[nums.length];
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        Random random = new Random();
        for (int i = 0; i < nums.length; ++i) {
            int j = random.nextInt(list.size());
            shuffled[i] = list.remove(j);
        }
        System.arraycopy(shuffled,0,nums,0,nums.length);
        return nums;
    }
}
