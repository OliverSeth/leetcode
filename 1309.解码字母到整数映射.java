/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-14 12:06:59 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-14 12:06:59 
 */
/*
 * @lc app=leetcode.cn id=1309 lang=java
 *
 * [1309] 解码字母到整数映射
 */

// @lc code=start
class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                sb.insert(0, (char) ('a' - 1 + (s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0')));
                i -= 2;
            } else {
                sb.insert(0, (char) ('a' + s.charAt(i) - '1'));
            }
        }
        return sb.toString();
    }
}
// @lc code=end
