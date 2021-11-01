package cn.hsmxg1204.learnday19;

import java.util.HashSet;
import java.util.Set;

/**
 * TODO
 *
 * @author gxming
 * @description
 * @date 2021-11-01 8:44
 */
public class DistributeCandies {
    public static int distributeCandies(int[] candyType){
        int length = candyType.length;
        int halfLength = length / 2;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < candyType.length; i++) {
            set.add(candyType[i]);
        }
        if(set.size() >= halfLength){
            return halfLength;
        }else{
            return set.size();
        }
    }

    public static void main(String[] args) {
        int[] candies = {1,1,2,2,3,3};
        int[] candies2 = {1,1,2,3};
        System.out.println(distributeCandies(candies));

        System.out.println(distributeCandies(candies2));
    }
}
