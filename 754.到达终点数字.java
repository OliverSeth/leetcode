/*
 * @Author: Oliver Seth 
 * @Date: 2020-12-29 10:20:40 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-12-29 10:20:40 
 */
/*
 * @lc app=leetcode.cn id=754 lang=java
 *
 * [754] 到达终点数字
 */

// @lc code=start
class Solution {
    public int reachNumber(int target) {
        if (target < 0) {
            return reachNumber(-target);
        }
        int pos = 0;
        int cnt = 1;
        while (pos < target || (pos - target) % 2 != 0) {
            pos += cnt;
            cnt++;
        }
        return cnt - 1;
    }
}
// @lc code=end

