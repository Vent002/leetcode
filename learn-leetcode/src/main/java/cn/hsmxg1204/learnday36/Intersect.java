package cn.hsmxg1204.learnday36;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * TODO
 *
 * @author gxming
 * @description 350. 两个数组的交集 II
 * @date 2021-11-24 11:35
 */
public class Intersect {
    /**
     * 使用hash表
     * @param num1
     * @param num2
     * @return
     */
    public static int[] intersect(int[] num1,int[] num2){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num1.length; i++) {
            map.put(num1[i],map.getOrDefault(num1[i],0) + 1 );
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < num2.length; i++) {
            int count = map.getOrDefault(num2[i], 0 );
            if(count > 0 ){
                result.add(num2[i]);
                count--;
                if(count > 0){
                    map.put(num2[i],count);
                }else{
                    map.remove(num2[i]);
                }
            }
        }
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;
    }

    /**
     * 先排序，再使用双指针；
     * @param nums1
     * @param nums2
     * @return
     */
    public static int[] intersectionByDoublePointer(int[] nums1,int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int a = nums1.length, b = nums2.length;
        int[] res = new int[Math.min(a,b)];
        int index1 = 0, index2 = 0, index = 0;
        while (index1 < a && index2 < b){
            if(nums1[index1] < nums2[index2]){
                index1++;
            }else if(nums1[index1] > nums2[index2]){
                index2++;
            }else{
                res[index] = nums1[index1];
                index++;
                index1++;
                index2++;
            }
        }
        return Arrays.copyOfRange(res, 0, index);
    }
    public static void main(String[] args) {
        int[] num1 = {1,2,2,1},num2 = {2,2};
        int[] num3 = {4,9,5},num4 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(num1, num2)));
        System.out.println(Arrays.toString(intersect(num3, num4)));


        System.out.println(Arrays.toString(intersectionByDoublePointer(num1, num2)));
        System.out.println(Arrays.toString(intersectionByDoublePointer(num3, num4)));
    }
}
