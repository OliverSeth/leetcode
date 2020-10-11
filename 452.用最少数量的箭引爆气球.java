/*
 * @Author: Oliver Seth 
 * @Date: 2020-10-11 12:00:04 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-10-11 12:00:04 
 */
/*
 * @lc app=leetcode.cn id=452 lang=java
 *
 * [452] 用最少数量的箭引爆气球
 */

// @lc code=start
class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] <= o2[1]) {
                    return -1;
                } else {
                    return 1;
                }
            }
        });
        int num = 1;
        int right = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > right) {
                right = points[i][1];
                num++;
            }
        }
        return num;
    }
}
// @lc code=end

