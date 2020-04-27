/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-27 13:07:59 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-27 13:07:59 
 */
/*
 * @lc app=leetcode.cn id=1252 lang=java
 *
 * [1252] 奇数值单元格的数目
 */

// @lc code=start
class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int[] row = new int[n];
        int[] column = new int[m];
        for (int[] indice : indices) {
            row[indice[0]]++;
            column[indice[1]]++;
        }
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((row[i] + column[j]) % 2 == 1) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
// @lc code=end
