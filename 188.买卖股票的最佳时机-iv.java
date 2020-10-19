/*
 * @Author: Oliver Seth 
 * @Date: 2020-10-19 12:12:15 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-10-19 12:12:15 
 */
/*
 * @lc app=leetcode.cn id=188 lang=java
 *
 * [188] 买卖股票的最佳时机 IV
 */

// @lc code=start
class Solution {
    public int maxProfit(int k, int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        if (k * 2 >= prices.length) {
            int buy = 0;
            int sale = -prices[0];
            for (int i = 1; i < prices.length; i++) {
                buy = Math.max(buy, sale + prices[i]);
                sale = Math.max(sale, buy - prices[i]);
            }
            return Math.max(buy, sale);
        }
        int dp[][] = new int[k + 1][2];
        for (int i = 0; i <= k; i++) {
            dp[i][1] = -prices[0];
        }
        for (int i = 0; i < prices.length; i++) {
            for (int j = k; j > 0; j--) {
                dp[j - 1][1] = Math.max(dp[j - 1][1], dp[j - 1][0] - prices[i]);
                dp[j][0] = Math.max(dp[j][0], dp[j - 1][1] + prices[i]);
            }
        }
        return dp[k][0];
    }
}
// @lc code=end

