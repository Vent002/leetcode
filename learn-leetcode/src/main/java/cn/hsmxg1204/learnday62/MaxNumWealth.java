package cn.hsmxg1204.learnday62;

import java.util.ArrayList;

/**
 * @Author gxming
 * @Description 1672. 最富有客户的资产总量
 * @CreateTime 2022-04-14 15:12
 */
public class MaxNumWealth {

    public static int maxNumWealth(int[][] accounts){
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < accounts.length; i++) {
            int sumAccount = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                int curAccount = accounts[i][j];
                sumAccount += curAccount;
            }
            res.add(sumAccount);
        }
        int result = 0;
        for (int i = 0; i < res.size(); i++) {
            result = Math.max(result,res.get(i));
        }
        return result;
    }

    public static int maxNumWealthUpdate(int[][] accounts){
        int length = accounts.length;
        int sumAccount = 0;
        for (int i = 0; i < length; i++) {
            int curAccount = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                curAccount += accounts[i][j];
            }
            sumAccount = Math.max(sumAccount,curAccount);
        }
        return sumAccount;
    }
    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        long l = System.currentTimeMillis();
        System.out.println(maxNumWealth(accounts));
        System.out.println(System.currentTimeMillis() - l);
        long l2 = System.currentTimeMillis();
        System.out.println(maxNumWealthUpdate(accounts));
        System.out.println(System.currentTimeMillis() - l2);
    }
}
