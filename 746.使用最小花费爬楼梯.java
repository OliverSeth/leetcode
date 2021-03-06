/*
 * @Author: Oliver Seth 
 * @Date: 2020-12-21 16:15:03 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-12-21 16:15:56
 */
/*
 * @lc app=leetcode.cn id=746 lang=java
 *
 * [746] 使用最小花费爬楼梯
 */

// @lc code=start
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < cost.length; i++) {
            dp[i] = Math.min(dp[i - 2], dp[i - 1]) + cost[i];
        }
        return Math.min(dp[dp.length - 1], dp[dp.length - 2]);
    }
}
// @lc code=end

