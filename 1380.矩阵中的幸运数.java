/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-27 23:40:34 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-03-27 23:40:34 
 */
/*
 * @lc app=leetcode.cn id=1380 lang=java
 *
 * [1380] 矩阵中的幸运数
 */

// @lc code=start
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int minNum = 0;
        int mini = 0;
        boolean isFound = true;
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            minNum = matrix[i][0];
            mini = 0;
            isFound = true;
            for (int j = 1; j < matrix[0].length; j++) {
                if (minNum > matrix[i][j]) {
                    minNum = matrix[i][j];
                    mini = j;
                }
            }
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][mini] > matrix[i][mini]) {
                    isFound = false;
                    break;
                }
            }
            if (isFound) {
                res.add(matrix[i][mini]);
            }
        }
        return res;
    }
}
// @lc code=end

