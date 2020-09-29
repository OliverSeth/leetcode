/*
 * @Author: Oliver Seth 
 * @Date: 2020-09-29 20:00:09 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-09-29 20:00:09 
 */
/*
 * @lc app=leetcode.cn id=73 lang=java
 *
 * [73] 矩阵置零
 */

// @lc code=start
class Solution {
    public void setZeroes(int[][] matrix) {
        boolean isRow = false;
        boolean isColumn = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0) {
                        isRow = true;
                    }
                    if (j == 0) {
                        isColumn = true;
                    }
                    setFirstZero(matrix, i, j);
                }
            }
        }
        for (int i = matrix.length - 1; i > 0; i--) {
            for (int j = matrix[i].length - 1; j > 0; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (matrix[0][0] == 0) {
            if (isRow) {
                for (int i = 0; i < matrix[0].length; i++) {
                    matrix[0][i] = 0;
                }
            }
            if (isColumn) {
                for (int i = 0; i < matrix.length; i++) {
                    matrix[i][0] = 0;
                }
            }
        }
    }

    private void setFirstZero(int[][] matrix, int m, int n) {
        matrix[m][0] = 0;
        matrix[0][n] = 0;
    }
}
// @lc code=end

