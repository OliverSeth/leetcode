/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-06 22:55:05 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-06 22:55:05 
 */
/*
 * @lc app=leetcode.cn id=1404 lang=java
 *
 * [1404] 将二进制表示减到 1 的步骤数
 */

// @lc code=start
class Solution {
    public int numSteps(String s) {
        StringBuilder sb = new StringBuilder(s);
        int cnt = 0;
        while (!sb.toString().equals("1")) {
            if (sb.charAt(sb.length() - 1) == '1') {
                int i = sb.length() - 1;
                for (; i >= 0; i--) {
                    if (sb.charAt(i) == '1') {
                        sb.setCharAt(i, '0');
                    } else {
                        sb.setCharAt(i, '1');
                        break;
                    }
                }
                if (i == -1) {
                    sb.insert(0, '1');
                }
            } else {
                sb.deleteCharAt(sb.length() - 1);
            }
            cnt++;
        }
        return cnt;
    }
}
// @lc code=end

