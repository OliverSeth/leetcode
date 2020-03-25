/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-26 00:48:28 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-03-26 00:58:36
 */
/*
 * @lc app=leetcode.cn id=999 lang=java
 *
 * [999] 车的可用捕获量
 */

// @lc code=start
class Solution {
    public int numRookCaptures(char[][] board) {
        int m = 0;
        int n = 0;
        int num = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'R') {
                    m = i;
                    n = j;
                    break;
                }
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (board[m][i] == 'B') {
                break;
            }
            if (board[m][i] == 'p') {
                num++;
                break;
            }
        }
        for (int i = n + 1; i < board[0].length; i++) {
            if (board[m][i] == 'B') {
                break;
            }
            if (board[m][i] == 'p') {
                num++;
                break;
            }
        }
        for (int i = m - 1; i >= 0; i--) {
            if (board[i][n] == 'B') {
                break;
            }
            if (board[i][n] == 'p') {
                num++;
                break;
            }
        }
        for (int i = m + 1; i < board.length; i++) {
            if (board[i][n] == 'B') {
                break;
            }
            if (board[i][n] == 'p') {
                num++;
                break;
            }
        }
        return num;
    }
}
// @lc code=end
