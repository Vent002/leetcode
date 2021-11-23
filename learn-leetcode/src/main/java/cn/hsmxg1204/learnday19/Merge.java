package cn.hsmxg1204.learnday19;

import java.util.Arrays;

/**
 * TODO
 *
 * @author gxming
 * @description 88. 合并两个有序数组
 * @date 2021-11-01 13:07
 */
public class Merge {
    /**
     * 直接合并然后排序
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static void merge(int[] nums1,int m,int [] nums2,int n){
        for (int i = 0;i != n; ++i){
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    /**
     * 双指针
     * @param nums1
     * @param m
     * @param nums2
     * @param n
     */
    public static void mergeByDouble(int[] nums1,int m,int [] nums2,int n){
        int p1 = 0,p2 = 0;
        int[] sorted = new int[m+n];
        int cur;
        while( p1 < m || p2 < n){
            if(p1 == m){
                cur = nums2[p2++];
            }else if(p2 == n){
                cur = nums1[p1++];
            }else if(nums1[p1] < nums2[p2]){
                cur = nums1[p1++];
            }else{
                cur = nums2[p2++];
            }
            sorted[p1 + p2 - 1] = cur;
        }
        for (int i = 0; i != m+n; ++i){
            nums1[i] = sorted[i];
        }
        System.out.println(Arrays.toString(nums1));
    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1,3,nums2,3);
        mergeByDouble(nums1,3,nums2,3);
    }
}
