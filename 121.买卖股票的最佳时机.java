/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-20 16:55:28 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-03-20 16:57:45
 */
/*
 * @lc app=leetcode.cn id=121 lang=java
 *
 * [121] 买卖股票的最佳时机
 */

// @lc code=start
class Solution {
    public int maxProfit(int[] prices) {
        int minNum = Integer.MAX_VALUE;
        int maxPro = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minNum) {
                minNum = prices[i];
            } else {
                maxPro = Math.max(maxPro, prices[i] - minNum);
            }
        }
        return maxPro;
    }
}
// @lc code=end
