/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-25 18:23:49 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-03-25 18:23:49 
 */
/*
 * @lc app=leetcode.cn id=892 lang=java
 *
 * [892] 三维形体的表面积
 */

// @lc code=start
class Solution {
    public int surfaceArea(int[][] grid) {
        int cube = 0;
        int face = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                cube += grid[i][j];
                if (grid[i][j] > 0) {
                    face += grid[i][j] - 1;
                }
                if (i > 0) {
                    face += Math.min(grid[i - 1][j], grid[i][j]);
                }
                if (j > 0) {
                    face += Math.min(grid[i][j - 1], grid[i][j]);
                }
            }
        }
        return 6 * cube - face * 2;
    }
}
// @lc code=end
