package cn.hsmxg1204.learnday40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * TODO
 *
 * @author gxming
 * @description
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
