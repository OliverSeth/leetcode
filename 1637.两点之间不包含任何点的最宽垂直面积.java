/*
 * @Author: Oliver Seth 
 * @Date: 2020-11-04 10:10:23 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-11-04 10:10:23 
 */
/*
 * @lc app=leetcode.cn id=1637 lang=java
 *
 * [1637] 两点之间不包含任何点的最宽垂直面积
 */

// @lc code=start
class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[0] < o2[0]) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        int width = points[1][0] - points[0][0];
        for (int i = 2; i < points.length; i++) {
            width = Math.max(width, points[i][0] - points[i - 1][0]);
        }
        return width;
    }
}// @lc code=end

