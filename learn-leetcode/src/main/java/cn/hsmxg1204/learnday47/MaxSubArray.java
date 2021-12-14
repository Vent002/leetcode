package cn.hsmxg1204.learnday47;

/**
 * @Author gxming
 * @Description 最大子序和
 * @CreateTime 2021-12-14 19:18
 */
public class MaxSubArray {
    public static int maxSubArray(int[] nums){
        int pre = 0,maxSub = nums[0];
        for (int x : nums){
            pre = Math.max(pre + x,x);
            maxSub = Math.max(maxSub,pre);
        }
        return maxSub;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
