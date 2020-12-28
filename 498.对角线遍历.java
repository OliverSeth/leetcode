/*
 * @Author: Oliver Seth 
 * @Date: 2020-12-26 12:18:57 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-12-26 12:19:19
 */
/*
 * @lc app=leetcode.cn id=498 lang=java
 *
 * [498] 对角线遍历
 */

// @lc code=start
class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        int[] res = new int[matrix.length * matrix[0].length];
        int i = 0, j = 0;
        int pos = 0;
        boolean up = true;
        while (i < matrix.length && j < matrix[0].length) {
            res[pos++] = matrix[i][j];
            if (i == matrix.length - 1 && up == false) {
                up = true;
                j++;
            } else if (j == 0 && up == false) {
                up = true;
                i++;
            } else if (j == matrix[0].length - 1 && up == true) {
                up = false;
                i++;
            } else if (i == 0 && up == true) {
                up = false;
                j++;
            } else {
                if (up) {
                    i--;
                    j++;
                } else {
                    i++;
                    j--;
                }
            }
        }
        return res;
    }
}
// @lc code=end

