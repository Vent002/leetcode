package cn.hsmxg1204.learnday54;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author gxming
 * @Description garyCode
 * @CreateTime 2022-01-08 20:55
 */
public class GaryCode {
    /**
     * 对称生成
     * @param n
     * @return
     */
    public List<Integer> garyCode(int n){
        List<Integer> result = new ArrayList<>();
        result.add(0);
        for (int i = 0; i < n; i++) {
            int m = result.size();
            /**
             * 位与(&)
             * 5 & 3
             * 0101
             * 0011
             * 与之后的结果是 0001 ---> 1
             *
             * 位或(|)
             * 5 | 3
             *  0101
             *  0011
             *  或之后的结果 0111 ---> 7
             *
             *  位异或(^)
             *  5 ^ 3
             *  0101
             *  0011
             *  异或之后的结果 0110 --->6
             *
             *  位非(~)
             *
             *  ~5 ---> -6
             */
            for (int j = m - 1; j >= 0 ; j--) {
                result.add(result.get(j) | (1 << (i - 1)));
            }
        }
        return result;
    }

    public List<Integer> garyCodeByBinary(int n){
        List<Integer> result = new ArrayList<>();
        /**
         * << 左移
         * 转为二进制数，向左移动，
         * eg. 5<< 2
         * 5的二进制表示   0101
         * 0000000000001 0100  ---> 20
         */
        for (int i = 0; i < 1 << n; i++) {
            // >> 右移 同上
            result.add((i >> 1) ^ i);
        }
        return result;
    }
}
