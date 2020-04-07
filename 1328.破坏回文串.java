/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-07 17:55:34 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-07 17:55:34 
 */
/*
 * @lc app=leetcode.cn id=1328 lang=java
 *
 * [1328] 破坏回文串
 */

// @lc code=start
class Solution {
    public String breakPalindrome(String palindrome) {
        if (palindrome.length() == 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder(palindrome);
        int i = 0;
        for (; i < sb.length(); i++) {
            if (sb.charAt(i) != 'a' && !(palindrome.length() % 2 == 1 && i == palindrome.length() / 2)) {
                sb.setCharAt(i, 'a');
                break;
            }
        }
        if (i == sb.length()) {
            sb.setCharAt(sb.length() - 1, 'b');
        }
        return sb.toString();
    }
}
// @lc code=end

