/*
 * @Author: Oliver Seth 
 * @Date: 2020-05-22 17:35:52 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-05-22 17:35:52 
 */
/*
 * @lc app=leetcode.cn id=1217 lang=java
 *
 * [1217] 玩筹码
 */

// @lc code=start
class Solution {
    public int minCostToMoveChips(int[] chips) {
        int odd = 0;
        int even = 0;
        for (int chip : chips) {
            if (chip % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return Math.min(odd, even);
    }
}
// @lc code=end
