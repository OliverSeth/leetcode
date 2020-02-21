/*
 * @Author: Oliver Seth 
 * @Date: 2020-02-21 15:06:30 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-02-21 15:20:16
 */
/*
 * @lc app=leetcode.cn id=59 lang=java
 *
 * [59] 螺旋矩阵 II
 */

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
        int i = 1;
        int[][] matrix = new int[n][n];
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;
        while (i <= n * n) {
            for (int j = left; j <= right; j++) {
                matrix[top][j] = i++;
            }
            if (i > n * n) {
                break;
            }
            for (int j = top + 1; j <= bottom; j++) {
                matrix[j][right] = i++;
            }
            if (i > n * n) {
                break;
            }
            for (int j = right - 1; j >= left; j--) {
                matrix[bottom][j] = i++;
            }
            if (i > n * n) {
                break;
            }
            for (int j = bottom - 1; j >= top + 1; j--) {
                matrix[j][left] = i++;
            }
            left++;
            top++;
            right--;
            bottom--;
        }
        return matrix;
    }
}
// @lc code=end
