/*
 * @Author: Oliver Seth 
 * @Date: 2020-11-22 13:43:28 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-11-22 13:43:28 
 */
/*
 * @lc app=leetcode.cn id=902 lang=java
 *
 * [902] 最大为 N 的数字组合
 */

// @lc code=start
class Solution {
    public int atMostNGivenDigitSet(String[] digits, int n) {
        String str = String.valueOf(n);
        int[] dp = new int[str.length() + 1];
        dp[0] = 1;
        int[] num = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            num[i] = (int) Math.pow(digits.length, i);
        }
        for (int i = 1; i < str.length() + 1; i++) {
            for (int j = 0; j < digits.length; j++) {
                if (digits[j].charAt(0) < str.charAt(str.length() - i)) {
                    dp[i] += num[i - 1];
                } else if (digits[j].charAt(0) == str.charAt(str.length() - i)) {
                    dp[i] += dp[i - 1];
                }
            }
        }
        for (int i = 1; i < str.length(); i++) {
            dp[str.length()] += num[i];
        }
        return dp[str.length()];
    }
}
// @lc code=end

