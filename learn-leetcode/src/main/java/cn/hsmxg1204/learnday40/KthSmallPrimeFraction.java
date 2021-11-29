package cn.hsmxg1204.learnday40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * TODO
 *
 * @author gxming
 * @description 786. 第 K 个最小的素数分数
 * 给你一个按递增顺序排序的数组 arr 和一个整数 k 。数组 arr 由 1 和若干 素数  组成，且其中所有整数互不相同。
 *
 * 对于每对满足 0 < i < j < arr.length 的 i 和 j ，可以得到分数 arr[i] / arr[j] 。
 *
 * 那么第 k 个最小的分数是多少呢?  以长度为 2 的整数数组返回你的答案, 这里 answer[0] == arr[i] 且 answer[1] == arr[j] 。
 *
 *  
 * 示例 1：
 *
 * 输入：arr = [1,2,3,5], k = 3
 * 输出：[2,5]
 * 解释：已构造好的分数,排序后如下所示:
 * 1/5, 1/3, 2/5, 1/2, 3/5, 2/3
 * 很明显第三个最小的分数是 2/5
 * 示例 2：
 *
 * 输入：arr = [1,7], k = 1
 * 输出：[1,7]
 *
 * @date 2021-11-29 8:49
 */
public class KthSmallPrimeFraction {
    public static int[] kthSmallPrimeFraction(int[] arr,int k){
        int n = arr.length;
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                list.add(arr[i] * 1.0 / arr[j]);
            }
        }
        Collections.sort(list);
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(arr[i] * 1.0 /arr[j] == list.get(k - 1)) return new int[]{arr[i],arr[j]};
            }
        }
        return new int[]{0,0};
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int k = 3;
        Arrays.stream(kthSmallPrimeFraction(arr,k)).forEach(System.out::println);
    }
}
