/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-18 21:02:31 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-03-18 21:02:31 
 */
class Solution {
    private boolean[][] row = new boolean[9][9];
    private boolean[][] column = new boolean[9][9];
    private boolean[][] cell = new boolean[9][9];
    private char[][] board;
    boolean isSolved = false;

    public void solveSudoku(char[][] board) {
        this.board = board;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    row[i][board[i][j] - '1'] = true;
                    column[j][board[i][j] - '1'] = true;
                    cell[i / 3 * 3 + j / 3][board[i][j] - '1'] = true;
                }
            }
        }
        backTrack(0, 0);
    }

    private void nextNumber(int row, int column) {
        if (row == 8 && column == 8) {
            isSolved = true;
            return;
        } else {
            if (column == 8) {
                backTrack(row + 1, 0);
            } else {
                backTrack(row, column + 1);
            }
        }
    }

    private void placeNumber(int row, int column, int num) {
        board[row][column] = (char) (num + '0');
        this.row[row][num - 1] = true;
        this.column[column][num - 1] = true;
        cell[row / 3 * 3 + column / 3][num - 1] = true;
    }

    private void removeNumber(int row, int column, int num) {
        board[row][column] = '.';
        this.row[row][num - 1] = false;
        this.column[column][num - 1] = false;
        cell[row / 3 * 3 + column / 3][num - 1] = false;
    }

    private void backTrack(int row, int column) {
        if (board[row][column] == '.') {
            for (int i = 1; i <= 9; i++) {
                if (isValid(row, column, i)) {
                    placeNumber(row, column, i);
                    nextNumber(row, column);
                    if (!isSolved) {
                        removeNumber(row, column, i);
                    }
                }
            }
        } else {
            nextNumber(row, column);
        }
    }

    private boolean isValid(int row, int column, int num) {
        return !(this.row[row][num - 1] || this.column[column][num - 1] || cell[row / 3 * 3 + column / 3][num - 1]);
    }
}