/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-18 22:10:17 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-18 22:10:17 
 */
/*
 * @lc app=leetcode.cn id=1400 lang=java
 *
 * [1400] 构造 K 个回文字符串
 */

// @lc code=start
class Solution {
    public boolean canConstruct(String s, int k) {
        int[] chara = new int[26];
        for (int i = 0; i < s.length(); i++) {
            chara[s.charAt(i) - 'a']++;
        }
        int odd = 0;
        int even = 0;
        for (int i = 0; i < 26; i++) {
            if (chara[i] % 2 == 1) {
                odd++;
            } else if (chara[i] != 0) {
                even++;
            }
        }
        return odd <= k && k <= s.length();
    }
}
// @lc code=end
