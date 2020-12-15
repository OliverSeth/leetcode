/*
 * @Author: Oliver Seth 
 * @Date: 2020-12-14 19:32:24 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-12-14 19:32:24 
 */
/*
 * @lc app=leetcode.cn id=312 lang=java
 *
 * [312] 戳气球
 */

// @lc code=start
class Solution {
    public int maxCoins(int[] nums) {
        int[][] dp = new int[nums.length + 2][nums.length + 2];
        int[] arr = new int[nums.length + 2];
        for (int i = 0; i < nums.length + 2; i++) {
            if (i == 0 || i == nums.length + 1) {
                arr[i] = 1;
            } else {
                arr[i] = nums[i - 1];
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = i + 2; j < arr.length; j++) {
                for (int k = i + 1; k < j; k++) {
                    int sum = arr[i] * arr[k] * arr[j] + dp[i][k] + dp[k][j];
                    dp[i][j] = Math.max(dp[i][j], sum);
                }
            }
        }
        return dp[0][nums.length + 1];
    }
}
// @lc code=end

