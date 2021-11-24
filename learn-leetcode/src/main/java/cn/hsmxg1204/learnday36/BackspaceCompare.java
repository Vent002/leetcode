package cn.hsmxg1204.learnday36;

/**
 * TODO
 *
 * @author gxming
 * @description 844. 比较含退格的字符串
 * @date 2021-11-24 9:17
 */
public class BackspaceCompare {
    public static boolean backspaceCompare(String s,String t){
        return build(s).equals(build(t));
    }
    public static String build(String s){
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char chs = s.charAt(i);
            if(chs != '#'){
                newStr.append((char) chs);
            }else{
                if (newStr.length() > 0){
                    newStr.deleteCharAt(newStr.length() - 1);
                }
            }
        }
        return newStr.toString();
    }

    public static void main(String[] args) {
        String s = "ab#c";
        String t = "ad#c";
        System.out.println(backspaceCompare(s, t));
    }
}
