/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-11 17:21:23 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-11 17:21:23 
 */
/*
 * @lc app=leetcode.cn id=1314 lang=java
 *
 * [1314] 矩阵区域和
 */

// @lc code=start
class Solution {
    public int[][] matrixBlockSum(int[][] mat, int K) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] res = new int[m][n];
        for (int i = 0; i <= Math.min(K, m - 1); i++) {
            for (int j = 0; j <= Math.min(K, n - 1); j++) {
                res[0][0] += mat[i][j];
            }
        }
        for (int i = 1; i < m; i++) {
            res[i][0] = res[i - 1][0];
            if (i + K < m) {
                for (int j = 0; j <= Math.min(K, n - 1); j++) {
                    res[i][0] += mat[i + K][j];
                }
            }
            if (i - K > 0) {
                for (int j = 0; j <= Math.min(K, n - 1); j++) {
                    res[i][0] -= mat[i - K - 1][j];
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                res[i][j] = res[i][j - 1];
                if (j + K < n) {
                    for (int k = Math.max(0, i - K); k <= Math.min(i + K, m - 1); k++) {
                        res[i][j] += mat[k][j + K];
                    }
                }
                if (j - K > 0) {
                    for (int k = Math.max(0, i - K); k <= Math.min(i + K, m - 1); k++) {
                        res[i][j] -= mat[k][j - K - 1];
                    }
                }
            }
        }
        return res;
    }
}
// @lc code=end
