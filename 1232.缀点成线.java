/*
 * @Author: Oliver Seth 
 * @Date: 2020-05-02 12:09:03 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-05-02 12:09:03 
 */
/*
 * @lc app=leetcode.cn id=1232 lang=java
 *
 * [1232] 缀点成线
 */

// @lc code=start
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        for (int i = 1; i < coordinates.length - 1; i++) {
            if ((coordinates[i + 1][1] - coordinates[i][1])
                    * (coordinates[1][0] - coordinates[0][0]) != (coordinates[1][1] - coordinates[0][1])
                            * (coordinates[i + 1][0] - coordinates[i][0])) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end
