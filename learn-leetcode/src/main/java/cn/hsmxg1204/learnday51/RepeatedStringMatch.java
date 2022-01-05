package cn.hsmxg1204.learnday51;

import java.time.Clock;

/**
 * TODO
 *
 * @author gxming
 * @description 686. 重复叠加字符串匹配
 * @date 2021-12-22 8:53
 */
public class RepeatedStringMatch {
    /**
     * KMP 算法
     * @param a
     * @param b
     * @return
     */
    public static int repeatedStringMatch(String a,String b){
        int an = a.length(), bn = b.length();
        int index = strStr(a, b);
        if (index == -1) {
            return -1;
        }
        if (an - index >= bn) {
            return 1;
        }
        return (bn + index - an - 1) / an + 2;
    }

    public static int strStr(String haystack, String needle) {
        int n = haystack.length(), m = needle.length();
        if (m == 0) {
            return 0;
        }
        int[] pi = new int[m];
        for (int i = 1, j = 0; i < m; i++) {
            while (j > 0 && needle.charAt(i) != needle.charAt(j)) {
                j = pi[j - 1];
            }
            if (needle.charAt(i) == needle.charAt(j)) {
                j++;
            }
            pi[i] = j;
        }
        for (int i = 0, j = 0; i - j < n; i++) { // b 开始匹配的位置是否超过第一个叠加的 a
            while (j > 0 && haystack.charAt(i % n) != needle.charAt(j)) { // haystack 是循环叠加的字符串，所以取 i % n
                j = pi[j - 1];
            }
            if (haystack.charAt(i % n) == needle.charAt(j)) {
                j++;
            }
            if (j == m) {
                return i - m + 1;
            }
        }
        return -1;
    }

    public static int  repeatedStringMatchByDownLimit(String a,String b){
        StringBuilder sb = new StringBuilder();
        int ans = 0;
        while (sb.length() < b.length() && ++ans > 0) sb.append(b);
        Clock clock = Clock.systemDefaultZone();
        long millis = clock.millis();
        while (clock.millis() - millis < 100){
            if(sb.indexOf(b) != -1) return ans;
            sb.append(a);
            ans++;
        }
        return -1;
    }

    public static int  repeatedStringMatchBy(String a,String b){
        StringBuilder sb = new StringBuilder();
        int ans = 0;
        while (sb.length() < b.length() && ++ans > 0) sb.append(a);
        sb.append(a);
        int idx = sb.indexOf(b);
        if(idx == -1) return ans;
        return idx + b.length() > a.length() * ans ? ans + 1 : ans;
    }

    public static void main(String[] args) {
        String a = "a", b = "aa";
        Clock clock = Clock.systemDefaultZone();
        long millis = clock.millis();
        System.out.println(repeatedStringMatchBy(a, b));
        System.out.println(clock.millis() - millis);
    }
}
