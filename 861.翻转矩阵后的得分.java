/*
 * @Author: Oliver Seth 
 * @Date: 2020-12-07 11:13:35 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-12-07 11:13:35 
 */
/*
 * @lc app=leetcode.cn id=861 lang=java
 *
 * [861] 翻转矩阵后的得分
 */

// @lc code=start
class Solution {
    public int matrixScore(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i][0] == 0) {
                for (int j = 0; j < A[i].length; j++) {
                    A[i][j] = 1 - A[i][j];
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < A[0].length; i++) {
            int num = 0;
            for (int j = 0; j < A.length; j++) {
                num += A[j][i];
            }
            sum += Math.max(num, A.length - num) * Math.pow(2, A[0].length - i - 1);
        }
        return sum;
    }
}
// @lc code=end

