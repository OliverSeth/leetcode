/*
 * @Author: Oliver Seth 
 * @Date: 2020-12-18 13:11:30 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-12-18 13:11:30 
 */
/*
 * @lc app=leetcode.cn id=389 lang=java
 *
 * [389] 找不同
 */

// @lc code=start
class Solution {
    public char findTheDifference(String s, String t) {
        int[] sNum = new int[26];
        int[] tNum = new int[26];
        for (int i = 0; i < s.length(); i++) {
            sNum[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            tNum[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (sNum[i] == tNum[i] - 1) {
                return (char) ('a' + i);
            }
        }
        return 'a';
    }
}
// @lc code=end

