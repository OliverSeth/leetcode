/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-18 22:10:54 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-18 22:10:54 
 */
/*
 * @lc app=leetcode.cn id=1401 lang=java
 *
 * [1401] 圆和矩形是否有重叠
 */

// @lc code=start
class Solution {
    public boolean checkOverlap(int radius, int x_center, int y_center, int x1, int y1, int x2, int y2) {
        int r = radius * radius;
        if (x1 > x_center) {
            return !((x1 - x_center) > radius || y_center + Math.sqrt(r - (x1 - x_center) * (x1 - x_center)) < y1
                    || y_center - Math.sqrt(r - (x1 - x_center) * (x1 - x_center)) > y2);
        }
        if (x2 < x_center) {
            return !((x_center - x2) > radius || y_center + Math.sqrt(r - (x2 - x_center) * (x2 - x_center)) < y1
                    || y_center - Math.sqrt(r - (x2 - x_center) * (x2 - x_center)) > y2);
        }
        if (y1 > y_center) {
            return !((y1 - y_center) > radius || x_center + Math.sqrt(r - (y1 - y_center) * (y1 - y_center)) < x1
                    || x_center - Math.sqrt(r - (y1 - y_center) * (y1 - y_center)) > x2);
        }
        if (y2 < y_center) {
            return !((y_center - y2) > radius || x_center + Math.sqrt(r - (y2 - y_center) * (y2 - y_center)) < x1
                    || x_center - Math.sqrt(r - (y2 - y_center) * (y2 - y_center)) > x2);
        }
        return true;
    }
}
// @lc code=end
