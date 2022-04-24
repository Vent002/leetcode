package cn.hsmxg1204.learnday202204.learnday24;

/**
 * @Author gxming
 * @Description 868. 二进制间距
 * @CreateTime 2022-04-24 16:27
 */
public class BinaryGap {
    // 位运算
    public static int binaryGap(int n){
        String string = Integer.toBinaryString(n);
        int pre = -1;
        int max = 0;
        for (int i = 0; i < string.length(); i++) {

            if(string.charAt(i)=='1'){
                if(pre == -1){
                    pre = i;
                }else{
                    max = Math.max(i-pre,max);
                    pre = i;
                }
            }
        }
        return max;
    }

    public static int binaryGapV2(int n){
        int post = -1,max = 0;
        for (int i = 31;i >= 0; i--){
            if(((n >> i) & 1 ) == 1){
                if(post != -1) max = Math.max(max,post - i);
                post = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(binaryGap(5));

        System.out.println(binaryGapV2(5));

        System.out.println(binaryGap(22));
    }
}
