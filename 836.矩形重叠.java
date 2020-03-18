/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-18 23:13:57 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-03-18 23:13:57 
 */
/*
 * @lc app=leetcode.cn id=836 lang=java
 *
 * [836] 矩形重叠
 */

// @lc code=start
class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return !(rec1[2] <= rec2[0] || rec1[0] >= rec2[2] || rec1[1] >= rec2[3] || rec1[3] <= rec2[1]);
    }
}
// @lc code=end
