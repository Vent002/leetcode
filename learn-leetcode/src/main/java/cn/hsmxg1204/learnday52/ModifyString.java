package cn.hsmxg1204.learnday52;

/**
 * @Author gxming
 * @Description 替换所有的问号
 * @CreateTime 2022-01-05 19:08
 */
public class ModifyString {
    public static String modifyString(String str){
        int n = str.length();
        char[] chars = str.toCharArray();
        for (int i = 0; i < n; i++) {
            if(chars[i] == '?'){
                for (char ch ='a';ch <= 'c';++ch) {
                    if((i > 0 && chars[i - 1] == ch) || (i < n - 1 && chars[i + 1] == ch)){
                        continue;
                    }
                    chars[i] = ch;
                    break;
                }
            }
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        String s = "????????";
        System.out.println(modifyString(s));
    }
}
