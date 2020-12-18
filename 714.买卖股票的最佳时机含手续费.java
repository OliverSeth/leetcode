/*
 * @Author: Oliver Seth 
 * @Date: 2020-12-17 14:41:02 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-12-17 14:41:02 
 */
/*
 * @lc app=leetcode.cn id=714 lang=java
 *
 * [714] 买卖股票的最佳时机含手续费
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices, int fee) {
        int sell = 0;
        int buy = -prices[0];
        for (int i = 0; i < prices.length; i++) {
            sell = Math.max(sell, buy + prices[i] - fee);
            buy = Math.max(buy, sell - prices[i]);
        }
        return sell;
    }
}
// @lc code=end

