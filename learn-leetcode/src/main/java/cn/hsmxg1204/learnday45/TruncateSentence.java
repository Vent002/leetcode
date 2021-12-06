package cn.hsmxg1204.learnday45;

/**
 * TODO
 *
 * @author gxming
 * @description 1816. 截断句子
 * @date 2021-12-06 8:52
 */
public class TruncateSentence {
    public static String truncateSentence(String s,int k){
        String[] sentences = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < k; i++) {
            sb.append(sentences[i]).append(" ");
        }
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    public static String truncateSentences(String s,int k){
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ' && --k == 0){
                return s.substring(0,i);
            }
        }
        return s;
    }

    public static String truncateSentencesAns(String s,int k){
        int n = s.length();
        int end = 0,count =0;
        for (int i = 0; i <= n; i++) {
            if(i==n || s.charAt(i) == ' '){
                count++;
                if(count == k){
                    end = i;
                    break;
                }
            }
        }
        return s.substring(0,end);
    }

    public static void main(String[] args) {
        System.out.println(truncateSentence("Hello how are you Contestant",4));

        System.out.println(truncateSentences("Hello how are you Contestant",4));
        System.out.println(truncateSentencesAns("Hello how are you Contestant",4));
    }
}
