/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-07 22:17:38 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-03-07 22:17:38 
 */
/*
 * @lc app=leetcode.cn id=1358 lang=java
 *
 * [1358] 包含所有三种字符的子字符串数目
 */

// @lc code=start
class Solution {
    public int numberOfSubstrings(String s) {
        int left = 0;
        int right = 3;
        int cnt = 0;
        while (left <= s.length() - 3 && right <= s.length()) {
            String str = s.substring(left, right);
            if (str.contains("a") && str.contains("b") && str.contains("c")) {
                cnt += s.length() - right + 1;
                left++;
                if (right - left < 3) {
                    right++;
                }
            } else {
                right++;
            }
        }
        return cnt;
    }
}
// @lc code=end

