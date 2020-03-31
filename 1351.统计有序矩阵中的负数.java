/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-31 14:30:54 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-03-31 14:30:54 
 */
/*
 * @lc app=leetcode.cn id=1351 lang=java
 *
 * [1351] 统计有序矩阵中的负数
 */

// @lc code=start
class Solution {
    public int countNegatives(int[][] grid) {
        int cnt = 0;
        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = grid[0].length - 1; j >= 0; j--) {
                if (grid[i][j] < 0) {
                    cnt++;
                } else {
                    break;
                }
            }
        }
        return cnt;
    }
}
// @lc code=end

