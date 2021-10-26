package cn.hsmxg1204.learnday15;

/**
 * TODO
 *
 * @author gxming
 * @description
 * @date 2021-10-25 10:11
 */
public class SearchMatrix {
    public static boolean searchMatrix(int[][] matrix,int target){
//        for (int[] ints : matrix) {
//            for (int j = 0; j <= matrix.length ; j++) {
//                if (ints[j] == target) {
//                    return true;
//                } else if (ints[j] > target) {
//                    break;
//                }
//            }
//        }
//        return false;
        int length = matrix.length;
        if(length == 0){
            return false;
        }
        int rowLength = matrix[0].length;
        if(rowLength == 0){
            return false;
        }
        int m = 0;
        int n = rowLength - 1;
        while ( m < length && n >= 0){
            if(matrix[m][n] == target){
                return true;
            }else if(matrix[m][n] > target){
                n--;
            }else{
                m++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{-3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int[][] matrix1 = {{-1,3}};
        int[][] matrix2 = {{-5}};
        System.out.println(searchMatrix(matrix, -3));

        System.out.println(searchMatrix(matrix1, 3));
        System.out.println(searchMatrix(matrix2, -5));

    }
}
