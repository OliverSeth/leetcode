/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-19 13:49:49 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-03-19 14:03:15
 */
/*
 * @lc app=leetcode.cn id=409 lang=java
 *
 * [409] 最长回文串
 */

// @lc code=start
class Solution {
    public int longestPalindrome(String s) {
        int len = 0;
        boolean hasOdd = false;
        int[] fre = new int[52];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                fre[s.charAt(i) - 'a']++;
            } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                fre[s.charAt(i) - 'A' + 26]++;
            }
        }
        for (int i = 0; i < 52; i++) {
            if (fre[i] % 2 != 0) {
                hasOdd = true;
            }
            len += fre[i] / 2 * 2;
        }
        if (hasOdd) {
            len++;
        }
        return len;
    }
}
// @lc code=end
