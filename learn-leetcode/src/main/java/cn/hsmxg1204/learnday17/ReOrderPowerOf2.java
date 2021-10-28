package cn.hsmxg1204.learnday17;

import java.util.Arrays;

/**
 * TODO
 *
 * @author gxming
 * @description 给定正整数 N，我们按任何顺序（包括原始顺序）将数字重新排序，注意其前导数字不能为零。
 *
 * 如果我们可以通过上述方式得到 2 的幂，返回 true；否则，返回 false。
 *  提示：
 * 1 <= n <= 10^9
 * @date 2021-10-28 9:06
 */
public class ReOrderPowerOf2 {
    /**
     * 思路： 2 的幂的结果重新排序；eg: 2^10 = 1024, 给定正整数1024，重排后的结果是 --->  0124
     * @param n
     * @return
     */
    public static boolean reorderPowerOf2(int n){
        String[] rec ={"1","2","4","8","16","23","46","128","256","125","0124","0248","0469","1289","13468",
                "23678","35566","011237","122446","224588","0145678","0122579","0134449","0368888",
                "11266777","23334455","01466788","112234778","234455668","012356789","0112344778"};
        char[] at = String.valueOf(n).toCharArray();
        Arrays.sort(at);
        String str = new String(at);
        for(String p:rec){
            if(str.equals(p)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(reorderPowerOf2(1024));
    }
}
