package cn.hsmxg1204.learnday35;

import java.util.Arrays;

/**
 * TODO
 *
 * @author gxming
 * @description 859. 亲密字符串
 * 交换字母的定义是：取两个下标 i 和 j （下标从 0 开始）且满足 i != j ，接着交换 s[i] 和 s[j] 处的字符。
 *
 * 例如，在 "abcd" 中交换下标 0 和下标 2 的元素可以生成 "cbad" 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/buddy-strings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021-11-23 15:55
 */
public class BuddyString {
    public static boolean buddyString(String s,String goal){
        int n = s.length(),m = goal.length();
        if(n != m){
            return false;
        }
        int[] cnt1 = new int[26],cnt2 = new int[26];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int a = s.charAt(i) - 'a',b = goal.charAt(i) - 'a';
            cnt1[a]++;
            cnt2[b]++;
            if(a != b){
                sum++;
            }
        }
        System.out.println(Arrays.toString(cnt1) + "\n"+ Arrays.toString(cnt2));
        boolean ok = false;
        for (int i = 0; i < 26; i++) {
            if(cnt1[i] != cnt2[i]) {
                return false;
            }
            if(cnt1[i] > 1) {
                ok = true;
            }
        }
        return sum == 2 || (sum == 0 && ok);
    }

    public static void main(String[] args) {
        String s = "ab", goal = "ba";
        System.out.println(buddyString(s,goal));
    }
}
