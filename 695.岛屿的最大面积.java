/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-15 16:19:29 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-03-15 16:25:49
 */
/*
 * @lc app=leetcode.cn id=695 lang=java
 *
 * [695] 岛屿的最大面积
 */

// @lc code=start
class Solution {
    private int dfs(int[][] grid, int m, int n) {
        if (m < 0 || n < 0 || m >= grid.length || n >= grid[0].length || grid[m][n] == 0) {
            return 0;
        }
        grid[m][n] = 0;
        return dfs(grid, m - 1, n) + dfs(grid, m + 1, n) + dfs(grid, m, n - 1) + dfs(grid, m, n + 1) + 1;
    }

    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                maxArea = Math.max(maxArea, dfs(grid, i, j));
            }
        }
        return maxArea;
    }
}
// @lc code=end
