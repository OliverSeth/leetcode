/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-06 17:13:15 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-03-06 17:17:06
 */
/*
 * @lc app=leetcode.cn id=134 lang=java
 *
 * [134] 加油站
 */

// @lc code=start
class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        int crr = 0;
        int start = 0;
        for (int i = 0; i < gas.length; i++) {
            total += gas[i] - cost[i];
            crr += gas[i] - cost[i];
            if (crr < 0) {
                crr = 0;
                start = i + 1;
            }
        }
        return total < 0 ? -1 : start;
    }
}
// @lc code=end
