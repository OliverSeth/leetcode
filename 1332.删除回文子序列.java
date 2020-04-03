/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-03 19:54:09 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-03 19:54:09 
 */
/*
 * @lc app=leetcode.cn id=1332 lang=java
 *
 * [1332] 删除回文子序列
 */

// @lc code=start
class Solution {
    public int removePalindromeSub(String s) {
        boolean isA = false;
        boolean isB = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                isA = true;
            } else if (s.charAt(i) == 'b') {
                isB = true;
            }
            if (isA && isB) {
                break;
            }
        }
        if (isA && isB) {
            if (s.equals(new StringBuilder(s).reverse().toString())) {
                return 1;
            } else {
                return 2;
            }
        } else if (isA || isB) {
            return 1;
        } else {
            return 0;
        }
    }
}
// @lc code=end

