/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-15 16:08:53 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-03-15 16:17:54
 */
/*
 * @lc app=leetcode.cn id=200 lang=java
 *
 * [200] 岛屿数量
 */

// @lc code=start
class Solution {
    private void dfs(char[][] grid, int m, int n) {
        if (m < 0 || m >= grid.length || n < 0 || n >= grid[0].length || grid[m][n] == '0') {
            return;
        }
        grid[m][n] = '0';
        dfs(grid, m - 1, n);
        dfs(grid, m + 1, n);
        dfs(grid, m, n - 1);
        dfs(grid, m, n + 1);
    }

    public int numIslands(char[][] grid) {
        int num = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    num++;
                    dfs(grid, i, j);
                }
            }
        }
        return num;
    }
}
// @lc code=end
