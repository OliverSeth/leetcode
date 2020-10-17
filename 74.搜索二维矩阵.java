/*
 * @Author: Oliver Seth 
 * @Date: 2020-10-17 11:15:20 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-10-17 11:15:20 
 */
/*
 * @lc app=leetcode.cn id=74 lang=java
 *
 * [74] 搜索二维矩阵
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int row = searchRow(matrix, 0, matrix.length - 1, target);
        return searchColumn(matrix, 0, matrix[row].length - 1, row, target);
    }

    private int searchRow(int[][] matrix, int start, int end, int target) {
        if (start == end) {
            return start;
        }
        int mid = (start + end) / 2 + 1;
        if (matrix[mid][0] > target) {
            return searchRow(matrix, start, mid - 1, target);
        } else {
            return searchRow(matrix, mid, end, target);
        }
    }

    private boolean searchColumn(int[][] matrix, int start, int end, int row, int target) {
        if (start == end) {
            if (matrix[row][start] == target) {
                return true;
            } else {
                return false;
            }
        }
        int mid = (start + end) / 2;
        if (matrix[row][mid] < target) {
            return searchColumn(matrix, mid + 1, end, row, target);
        } else {
            return searchColumn(matrix, start, mid, row, target);
        }
    }
}
// @lc code=end

