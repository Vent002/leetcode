package cn.hsmxg1204.learnday46;

/**
 * @Author gxming
 * @Description 查找有序序列中第一次出现的目标值的下标
 * @CreateTime 2021-12-13 19:42
 */
public class FindSearchFirstNumInSortedArray {
    /**
     * 使用二分法
     * @param target 查找值
     * @param arrays 有序序列
     * @return 第一次出现的下标
     */
    public static int findSearchFirstNumInSortedArray(int target,int[] arrays){
        int length = arrays.length;
        if(length == 0){
            return -1;
        }
        // 左右指针
        int left=0,right = length - 1;
        if(arrays[right] < target){
            return -1;
        }
        while (left < right){
            int mid = left + ( right - left) / 2;
            if(arrays[mid] < target){
                left = mid + 1;
            }else if(arrays[mid] > target){
                right = mid - 1;
            }else{
                if(mid > 0 && arrays[mid - 1] == arrays[mid]){
                    while (mid - 1 >= 0 && arrays[mid - 1] == arrays[mid]){
                        mid--;
                    }
                    return mid;
                }else{
                    return mid;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,4,6,7};
        System.out.println(findSearchFirstNumInSortedArray(1, nums));


        int[] nums2 = {3,3,3,3,3,6,7};
        System.out.println(findSearchFirstNumInSortedArray(3, nums2));
    }
}
