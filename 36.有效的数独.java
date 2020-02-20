/*
 * @Author: Oliver Seth 
 * @Date: 2020-02-20 15:04:18 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-02-20 15:18:01
 */
/*
 * @lc app=leetcode.cn id=36 lang=java
 *
 * [36] 有效的数独
 */

// @lc code=start
class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] column = new boolean[9][9];
        boolean[][] cell = new boolean[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    continue;
                } else {
                    int num = board[i][j] - '1';
                    if (row[i][num] || column[j][num] || cell[(i / 3) * 3 + j / 3][num]) {
                        return false;
                    } else {
                        row[i][num] = true;
                        column[j][num] = true;
                        cell[(i / 3) * 3 + j / 3][num] = true;
                    }
                }
            }
        }
        return true;
    }
}
// @lc code=end
