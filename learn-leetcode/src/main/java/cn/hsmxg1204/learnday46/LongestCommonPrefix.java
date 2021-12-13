package cn.hsmxg1204.learnday46;

/**
 * @Author gxming
 * @Description 最长公共前缀
 * @CreateTime 2021-12-13 20:35
 */
public class LongestCommonPrefix {
    /**
     * 横向扫描
     * @param strs 字符串数组
     * @return
     */
    public static String longestCommonPrefix(String[] strs){
        if(strs == null || strs.length == 0){
            return "";
        }
        String prefix = strs[0];
        int count = strs.length;
        for (int i = 0; i < count; i++) {
            prefix = longestCommonPrefix(prefix,strs[i]);
            if(prefix.length() == 0){
                break;
            }
        }
        return prefix;
    }
    private static String longestCommonPrefix(String s1,String s2){
        int min = Math.min(s1.length(),s2.length());
        int index = 0;
        while(index < min && s1.charAt(index) == s2.charAt(index)){
            index++;
        }
        return s1.substring(0,index);
    }

    /**
     * 纵向扫描
     * @param strs
     * @return
     */
    public static String longestCommonPrefixTwo(String[] strs){
        if(strs == null || strs.length == 0){
            return "";
        }
        int length = strs[0].length();
        int count = strs.length;
        for (int i = 0; i < length; i++) {
            char ch = strs[0].charAt(i);
            for (int j = 0; j < count; j++) {
                if(i == strs[j].length() || strs[j].charAt(i) != ch){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }

    public static String longestCommonPrefixByDichotomy(String[] strs){
        if(strs == null || strs.length == 0){
            return "";
        }
        int minLength = Integer.MAX_VALUE;
        for(String val : strs){
            minLength = Math.min(minLength,val.length());
        }
        int left = 0,right = minLength;
        while (left < right){
            int mid = (right - left + 1) / 2 + left;
            if(isCommonPrefix(strs,mid)){
                left = mid;
            }else{
                right = mid - 1;
            }
        }
        return strs[0].substring(0,left);
    }
    private static boolean isCommonPrefix(String[] strs, int length){
        String str = strs[0].substring(0,length);
        int count = strs.length;
        for (int i = 0; i < count; i++) {
            String s = strs[i];
            for (int j = 0; j < length; j++) {
                if(str.charAt(j) != s.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
       String[] strs = {"flower","flow","flight"};
        long l = System.currentTimeMillis();
        System.out.println(longestCommonPrefix(strs));
        System.out.println(System.currentTimeMillis() - l);


        long l1 = System.currentTimeMillis();
        System.out.println(longestCommonPrefixTwo(strs));
        System.out.println(System.currentTimeMillis() - l1);

        long l2 = System.currentTimeMillis();
        System.out.println(longestCommonPrefixByDichotomy(strs));
        System.out.println(System.currentTimeMillis() - l2);
    }
}
