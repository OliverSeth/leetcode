/*
 * @Author: Oliver Seth 
 * @Date: 2020-02-17 23:40:42 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-02-17 23:57:43
 */
/*
 * @lc app=leetcode.cn id=48 lang=java
 *
 * [48] 旋转图像
 */

// @lc code=start
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            for (int k = 0; k < n; k++) {
                matrix[i][k] ^= matrix[j][k];
                matrix[j][k] ^= matrix[i][k];
                matrix[i][k] ^= matrix[j][k];
            }
            i++;
            j--;
        }
        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                matrix[i][j] ^= matrix[j][i];
                matrix[j][i] ^= matrix[i][j];
                matrix[i][j] ^= matrix[j][i];
            }
        }
    }
}
// @lc code=end
