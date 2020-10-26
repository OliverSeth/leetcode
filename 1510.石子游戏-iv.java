/*
 * @Author: Oliver Seth 
 * @Date: 2020-10-26 08:58:17 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-10-26 08:58:17 
 */
/*
 * @lc app=leetcode.cn id=1510 lang=java
 *
 * [1510] 石子游戏 IV
 */

// @lc code=start
class Solution {
    public boolean winnerSquareGame(int n) {
        boolean[] dp = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                if (!dp[i - j * j]) {
                    dp[i] = true;
                }
            }
        }
        return dp[n];
    }
}
// @lc code=end

