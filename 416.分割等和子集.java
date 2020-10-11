/*
 * @Author: Oliver Seth 
 * @Date: 2020-10-11 11:37:47 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-10-11 11:37:47 
 */
/*
 * @lc app=leetcode.cn id=416 lang=java
 *
 * [416] 分割等和子集
 */

// @lc code=start
class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if (sum % 2 == 1) {
            return false;
        }
        boolean[] dp = new boolean[sum / 2 + 1];
        dp[0] = true;
        for (int num : nums) {
            for (int i = dp.length - 1; i >= num; i--) {
                dp[i] = dp[i] || dp[i - num];
            }
        }
        return dp[dp.length - 1];
    }
}
// @lc code=end

