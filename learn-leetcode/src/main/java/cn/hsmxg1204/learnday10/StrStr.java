package cn.hsmxg1204.learnday10;

/**
 * TODO
 *  给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回  -1 。
 *
 *  
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/implement-strstr
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author gxming
 * @description
 * @date 2021-07-24 14:58
 */
public class StrStr {
    public static int strStr(String haystack,String needle){
        if(haystack.length() == 0 || needle.length() == 0){
            return 0;
        }
        int i = haystack.indexOf(needle);
        return i;
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
        System.out.println(strStr("aaaaa", "bba"));
        System.out.println(strStr("", ""));
    }
}
