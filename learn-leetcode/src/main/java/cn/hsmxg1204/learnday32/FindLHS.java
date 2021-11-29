package cn.hsmxg1204.learnday32;

import java.util.Arrays;

/**
 * @Author gxming
 * @Description 最长和谐子序列
 * @CreateTime 2021-11-20 11:22
 */
public class FindLHS {
    public static int findLHS(int[] nums){
        Arrays.sort(nums);
        int left = 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] - nums[left] > 1){
                left++;
            }
            if (nums[i] - nums[left] == 1){
                res = Math.max(res,i - left + 1);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,2,2,2,5,2,3,7};
        System.out.println(findLHS(nums));
    }
}
