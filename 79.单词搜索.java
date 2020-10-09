/*
 * @Author: Oliver Seth 
 * @Date: 2020-10-09 19:04:43 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-10-09 19:04:43 
 */
/*
 * @lc app=leetcode.cn id=79 lang=java
 *
 * [79] 单词搜索
 */

// @lc code=start
class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                boolean[][] isFind = new boolean[board.length][board[0].length];
                if (helper(board, isFind, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean helper(char[][] board, boolean[][] isFind, String word, int m, int n, int pos) {
        if (pos == word.length()) {
            return true;
        }
        if (m < 0 || m >= board.length || n < 0 || n >= board[0].length) {
            return false;
        }
        if (!isFind[m][n] && board[m][n] == word.charAt(pos)) {
            isFind[m][n] = true;
            if (helper(board, isFind, word, m + 1, n, pos + 1) || helper(board, isFind, word, m - 1, n, pos + 1)
                    || helper(board, isFind, word, m, n + 1, pos + 1) || helper(board, isFind, word, m, n - 1, pos + 1)) {
                return true;
            }
            isFind[m][n] = false;
        }
        return false;
    }
}
// @lc code=end

