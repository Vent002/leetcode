package cn.hsmxg1204.learnday36;

import java.util.ArrayList;
import java.util.List;

/**
 * TODO
 *
 * @author gxming
 * @description 杨辉三角
 * @date 2021-11-24 10:26
 */
public class Generate {

    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> ret = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i ; j++) {
                if(j == 0 || j==i){
                    // 边界
                    list.add(1);
                }else{
                    //
                    list.add(ret.get(i-1).get(j-1) + ret.get(i-1).get(j));
                }
            }
            ret.add(list);
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
