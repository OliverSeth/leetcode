/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-24 13:31:42 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-03-24 13:33:11
 */
/*
 * @lc app=leetcode.cn id=172 lang=java
 *
 * [172] 阶乘后的零
 */

// @lc code=start
class Solution {
    public int trailingZeroes(int n) {
        int cnt = 0;
        while (n > 4) {
            cnt += n / 5;
            n /= 5;
        }
        return cnt;
    }
}
// @lc code=end
