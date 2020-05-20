/*
 * @Author: Oliver Seth 
 * @Date: 2020-05-20 13:38:11 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-05-20 13:38:11 
 */
/*
 * @lc app=leetcode.cn id=1221 lang=java
 *
 * [1221] 分割平衡字符串
 */

// @lc code=start
class Solution {
    public int balancedStringSplit(String s) {
        int left = 0;
        int right = 0;
        int pos = 0;
        int cnt = 0;
        while (pos < s.length()) {
            switch (s.charAt(pos)) {
                case 'L':
                    left++;
                    break;
                case 'R':
                    right++;
                    break;
                default:
                    break;
            }
            if (left == right) {
                cnt++;
                left = 0;
                right = 0;
            }
            pos++;
        }
        return cnt;
    }
}
// @lc code=end
