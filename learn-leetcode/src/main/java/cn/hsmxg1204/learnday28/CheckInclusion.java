package cn.hsmxg1204.learnday28;

import java.util.Arrays;

/**
 * TODO
 *
 * @author gxming
 * @description 567. 字符串的排列
 *  给你两个字符串 s1 和 s2 ，写一个函数来判断 s2 是否包含 s1 的排列。如果是，返回 true ；否则，返回 false 。
 *
 * 换句话说，s1 的排列之一是 s2 的 子串 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：s1 = "ab" s2 = "eidbaooo"
 * 输出：true
 * 解释：s2 包含 s1 的排列之一 ("ba").
 * 示例 2：
 *
 * 输入：s1= "ab" s2 = "eidboaoo"
 * 输出：false
 *  
 *
 * 提示：
 *
 * 1 <= s1.length, s2.length <= 104
 * s1 和 s2 仅包含小写字母
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/permutation-in-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @date 2021-11-10 13:41
 */
public class CheckInclusion {
    public static boolean checkInclusion(String s1,String s2){
        int s1Length = s1.length();
        int s2Length = s2.length();
        if(s1Length > s2Length){
            return false;
        }
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];
        for (int i = 0;i < s1Length;++i){
            ++cnt1[s1.charAt(i) - 'a'];
            ++cnt2[s2.charAt(i) - 'a'];
        }
        if(Arrays.equals(cnt1,cnt2)){
            return true;
        }
        for (int i = s1Length; i < s2Length; ++i) {
            ++cnt2[s2.charAt(i) -'a'];
            --cnt2[s2.charAt(i - s1Length) - 'a'];
            if(Arrays.equals(cnt1,cnt2)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1, s2));
    }
}
