/*
 * @Author: Oliver Seth 
 * @Date: 2021-01-09 14:48:13 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2021-01-09 14:48:13 
 */
/*
 * @lc app=leetcode.cn id=123 lang=java
 *
 * [123] 买卖股票的最佳时机 III
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int buy0 = -prices[0];
        int buy1 = -prices[0];
        int sell0 = 0;
        int sell1 = 0;
        for (int price : prices) {
            buy0 = Math.max(buy0, -price);
            sell0 = Math.max(sell0, buy0 + price);
            buy1 = Math.max(buy1, sell0 - price);
            sell1 = Math.max(sell1, buy1 + price);
        }
        return sell1;
    }
}
// @lc code=end

