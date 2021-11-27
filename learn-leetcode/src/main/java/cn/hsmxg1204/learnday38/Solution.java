package cn.hsmxg1204.learnday38;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @Author gxming
 * @Description 随机翻转矩阵
 * @CreateTime 2021-11-27 09:53
 */
public class Solution {
    Map<Integer,Integer> map = new HashMap<>();
    int m = 0,n = 0,total;
    Random rnd = new Random();
    public Solution(int m,int n){
        this.m = m;
        this.n = n;
        this.total = m * n;
    }
    public int[] flip(){
        int x = rnd.nextInt();
        total--;
        int index = map.getOrDefault(x,x);
        map.put(x,map.getOrDefault(total,total));
        return new int[]{index / n,index % n};
    }

    public void reset(){
        total = m * n;
        map.clear();
    }

    public static void main(String[] args) {

    }
}
