package cn.hsmxg1204.learnday48;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author gxming
 * @Description 岛屿数量
 * @CreateTime 2021-12-18 14:15
 */
public class NumsIslands {
    public static int numsIslands(char[][] grid){
        if(grid == null || grid.length == 0) return 0;
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1'){
                    count++;
//                    dfs(grid,i,j);
                    bfs(grid,i,j);
                }
            }
        }
        return count;
    }

    /**
     * dfs
     * @param grid
     * @param i
     * @param j
     */
    private static void dfs(char[][] grid,int i,int j){
        // 边界，防止越界
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0'){
            return;
        }
        grid[i][j] = '0';
        // 上
        dfs(grid,i - 1,j);
        // 下
        dfs(grid,i + 1,j);
        // 右
        dfs(grid,i,j - 1);
        // 左
        dfs(grid,i,j + 1);
    }

    private static void bfs(char[][] grid,int i,int j){
      grid[i][j] = '0';
      int l = grid.length;
      int m = grid[0].length;
      Queue<Integer> queue = new LinkedList<>();
      int code = i * m + j;
      queue.add(code);
      while (!queue.isEmpty()){
          code = queue.poll();
          int x = code / m;
          int y = code % m;
          // 上
          if (x > 0 && grid[x-1][y] == '1'){
              grid[x-1][y] = '0';
              queue.add((x-1) * m + y);
          }
          // 下
          if (x < l - 1 && grid[x+1][y] == '1'){
              grid[x+1][y] = '0';
              queue.add((x+1) * m + y);
          }
          // 左
          if (y > 0 && grid[x][y - 1] == '1'){
              grid[x][y - 1] = '0';
              queue.add(x* m + y - 1);
          }
          // 右
          if (y < m - 1 && grid[x][y + 1] == '1'){
              grid[x][y + 1] = '0';
              queue.add(x * m + y + 1);
          }
      }
    }

    public static void main(String[] args) {
      char[][]  grid = {
              {'1','1','0','0','0'},
              {'1','1','0','0','0'},
              {'0','0','1','0','0'},
              {'0','0','0','1','1'}
        };
        System.out.println(numsIslands(grid));
    }
}
