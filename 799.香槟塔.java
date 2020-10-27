/*
 * @Author: Oliver Seth 
 * @Date: 2020-10-27 09:36:31 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-10-27 09:36:31 
 */
/*
 * @lc app=leetcode.cn id=799 lang=java
 *
 * [799] 香槟塔
 */

// @lc code=start
class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] tower = new double[101][101];
        tower[0][0] = (double) poured;
        for (int i = 0; i <= query_row; i++) {
            for (int j = 0; j <= i; j++) {
                if (tower[i][j] > 1) {
                    double tmp = (tower[i][j] - 1) / 2;
                    tower[i + 1][j] += tmp;
                    tower[i + 1][j + 1] += tmp;
                    tower[i][j] = 1;
                }
            }
        }
        return tower[query_row][query_glass];
    }
}
// @lc code=end

