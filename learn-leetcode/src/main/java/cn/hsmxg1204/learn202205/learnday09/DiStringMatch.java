package cn.hsmxg1204.learn202205.learnday09;

import java.util.Arrays;

/**
 * @Author gxming
 * @Description 增减字符串匹配
 * 贪心
 * @CreateTime 2022-05-09 16:31
 */
public class DiStringMatch {
    public static int[] diStringMatch(String s) {
        int n = s.length(), lo = 0, hi = n;
        int[] perm = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            perm[i] = s.charAt(i) == 'I' ? lo++ : hi--;
        }
        perm[n] = lo;
        return perm;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(diStringMatch("IDID")));
    }
}
