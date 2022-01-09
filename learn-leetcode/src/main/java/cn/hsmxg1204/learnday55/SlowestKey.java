package cn.hsmxg1204.learnday55;

import java.util.HashMap;

/**
 * @Author gxming
 * @Description 1629. 按键持续时间最长的键
 * @CreateTime 2022-01-09 11:47
 */
public class SlowestKey {

    public static char slowestKey(int[] releasesTimes,String keyWords){
        char ans = keyWords.charAt(0);
        int maxTime = releasesTimes[0];
        for (int i = 1; i < releasesTimes.length; i++) {
            char res = keyWords.charAt(i);
            if(releasesTimes[i] - releasesTimes[i-1] > maxTime ||
                    (maxTime == releasesTimes[i] - releasesTimes[i-1] && ans > res)){
                ans = res;
                maxTime = releasesTimes[i] - releasesTimes[i-1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] releases = {28,65,97};
        String key = "gaf";
        System.out.println(slowestKey(releases, key));
    }
}
