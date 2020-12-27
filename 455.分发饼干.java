/*
 * @Author: Oliver Seth 
 * @Date: 2020-12-25 12:48:35 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-12-25 12:48:35 
 */
/*
 * @lc app=leetcode.cn id=455 lang=java
 *
 * [455] 分发饼干
 */

// @lc code=start
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child = 0;
        int biscuit = 0;
        int cnt = 0;
        while (child < g.length && biscuit < s.length) {
            if (g[child] <= s[biscuit]) {
                cnt++;
                child++;
                biscuit++;
            } else {
                biscuit++;
            }
        }
        return cnt;
    }
}
// @lc code=end

