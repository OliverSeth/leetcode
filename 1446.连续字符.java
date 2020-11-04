/*
 * @Author: Oliver Seth 
 * @Date: 2020-11-04 10:03:41 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-11-04 10:03:41 
 */
/*
 * @lc app=leetcode.cn id=1446 lang=java
 *
 * [1446] 连续字符
 */

// @lc code=start
class Solution {
    public int maxPower(String s) {
        int maxPow = 1;
        int cnt = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                cnt++;
            } else {
                maxPow = Math.max(maxPow, cnt);
                cnt = 1;
            }
        }
        return Math.max(maxPow, cnt);
    }
}
// @lc code=end

