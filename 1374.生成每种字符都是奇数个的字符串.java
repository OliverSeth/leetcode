/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-28 17:14:36 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-03-28 17:14:36 
 */
/*
 * @lc app=leetcode.cn id=1374 lang=java
 *
 * [1374] 生成每种字符都是奇数个的字符串
 */

// @lc code=start
class Solution {
    public String generateTheString(int n) {
        StringBuilder sb = new StringBuilder();
        if (n % 2 == 0) {
            for (int i = 0; i < n - 1; i++) {
                sb.append('a');
            }
            sb.append('b');
        } else {
            for (int i = 0; i < n; i++) {
                sb.append('a');
            }
        }
        return sb.toString();
    }
}
// @lc code=end

