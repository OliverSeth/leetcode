/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-24 12:31:36 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-24 12:31:36 
 */
/*
 * @lc app=leetcode.cn id=1267 lang=java
 *
 * [1267] 统计参与通信的服务器
 */

// @lc code=start
class Solution {
    public int countServers(int[][] grid) {
        int[] row = new int[grid.length];
        int[] column = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    row[i]++;
                    column[j]++;
                }
            }
        }
        int cnt = 0;
        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < column.length; j++) {
                if (grid[i][j] == 1 && (row[i] > 1 || column[j] > 1)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
// @lc code=end
