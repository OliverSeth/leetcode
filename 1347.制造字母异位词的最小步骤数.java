/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-01 13:53:46 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-01 13:53:46 
 */
/*
 * @lc app=leetcode.cn id=1347 lang=java
 *
 * [1347] 制造字母异位词的最小步骤数
 */

// @lc code=start
class Solution {
    public int minSteps(String s, String t) {
        int[] sNum = new int[26];
        int[] tNum = new int[26];
        for (int i = 0; i < s.length(); i++) {
            sNum[s.charAt(i) - 'a']++;
            tNum[t.charAt(i) - 'a']++;
        }
        int step = 0;
        for (int i = 0; i < 26; i++) {
            sNum[i] -= tNum[i];
            if (sNum[i] > 0) {
                step += sNum[i];
            }
        }
        return step;
    }
}
// @lc code=end
