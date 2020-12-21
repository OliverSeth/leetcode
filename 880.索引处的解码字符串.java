/*
 * @Author: Oliver Seth 
 * @Date: 2020-12-21 16:09:44 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-12-21 16:09:44 
 */
/*
 * @lc app=leetcode.cn id=880 lang=java
 *
 * [880] 索引处的解码字符串
 */

// @lc code=start
class Solution {
    public String decodeAtIndex(String S, int K) {
        long len = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) >= 'a' && S.charAt(i) <= 'z') {
                len++;
            } else {
                len *= S.charAt(i) - '0';
            }
        }
        for (int i = S.length() - 1; i >= 0; i--) {
            K %= len;
            if (K == 0 && S.charAt(i) >= 'a' && S.charAt(i) <= 'z') {
                return String.valueOf(S.charAt(i));
            }
            if (S.charAt(i) >= 'a' && S.charAt(i) <= 'z') {
                len--;
            } else {
                len /= S.charAt(i) - '0';
            }
        }
        return "";
    }
}
// @lc code=end

