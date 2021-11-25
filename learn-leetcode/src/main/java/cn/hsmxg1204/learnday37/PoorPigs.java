package cn.hsmxg1204.learnday37;

/**
 * TODO
 *
 * @author gxming
 * @description 458. Poor Pigs
 *
 * There are buckets buckets of liquid, where exactly one of the buckets is poisonous. To figure out which one is poisonous, you feed some number of (poor) pigs the liquid to see whether they will die or not. Unfortunately, you only have minutesToTest minutes to determine which bucket is poisonous.
 *
 * You can feed the pigs according to these steps:
 *
 * <br>
 * Choose some live pigs to feed.
 * For each pig, choose which buckets to feed it. The pig will consume all the chosen buckets simultaneously and will take no time.
 * Wait for minutesToDie minutes. You may not feed any other pigs during this time.
 * After minutesToDie minutes have passed, any pigs that have been fed the poisonous bucket will die, and all others will survive.
 * Repeat this process until you run out of time.
 * Given buckets, minutesToDie, and minutesToTest, return the minimum number of pigs needed to figure out which bucket is poisonous within the allotted time.
 * </br>
 *
 * @date 2021-11-25 8:55
 */
public class PoorPigs {
    public static int poorPigs(int buckets,int minutesToDie,int minutesToTest){
        int states = minutesToTest / minutesToDie + 1;
        int pigs = (int) Math.ceil(Math.log(buckets) / Math.log(states));
        return pigs;
    }

    public static void main(String[] args) {
        System.out.println(poorPigs(1000, 15, 60));
    }
}
