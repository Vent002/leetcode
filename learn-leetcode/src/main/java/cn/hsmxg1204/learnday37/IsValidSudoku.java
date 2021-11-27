package cn.hsmxg1204.learnday37;

/**
 * TODO
 *
 * @author gxming
 * @description 有效的数独
 * @date 2021-11-25 8:43
 */
public class IsValidSudoku {
    public static boolean isValidSudoku(char[][] board){
        int[][] rows = new int[9][9];
        int[][] columns = new int[9][9];
        int[][][] boxes = new int[3][3][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if(c != '.'){
                    int index = c - '0' - 1;
                    rows[i][index]++;
                    columns[j][index]++;
                    boxes[i/3][j/3][index]++;
                    if(rows[i][index] > 1 || columns[j][index] > 1 || boxes[i /3][j / 3][index] > 1){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
