package cn.hsmxg1204.learnday49;

/**
 * @Author gxming
 * @Description 找到法官
 *  有向图
 *      每个人相信法官，法官不信任何一个人
 * @CreateTime 2021-12-19 18:03
 */
public class FindJudge {
    public static int findJudge(int n,int[][] trust){
        int[] inDegrees = new int[n + 1];
        int[] outDegrees = new int[n + 1];
        for (int[] val : trust){
            int x = val[0],y = val[1];
            ++inDegrees[y];
            ++outDegrees[x];
        }
        for (int i = 1;i <= n;++i){
            if(inDegrees[i] == n - 1 && outDegrees[i] == 0){
                return i;
            }
        }
        return -1;
    }
}
