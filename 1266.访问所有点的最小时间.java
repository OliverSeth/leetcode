/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-24 12:30:54 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-24 12:30:54 
 */
/*
 * @lc app=leetcode.cn id=1266 lang=java
 *
 * [1266] 访问所有点的最小时间
 */

// @lc code=start
class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int path = 0;
        for (int i = 0; i < points.length - 1; i++) {
            path += Math.max(Math.abs(points[i][0] - points[i + 1][0]), Math.abs(points[i][1] - points[i + 1][1]));
        }
        return path;
    }
}
// @lc code=end
