/*
 * @Author: Oliver Seth 
 * @Date: 2020-02-25 21:01:24 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-02-25 21:29:47
 */
/*
 * @lc app=leetcode.cn id=152 lang=java
 *
 * [152] 乘积最大子序列
 */

// @lc code=start
class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int ans = nums[i];
            max = Math.max(nums[i], max);
            for (int j = i + 1; j < nums.length; j++) {
                ans *= nums[j];
                max = Math.max(ans, max);
            }
        }
        return max;
    }
}
// @lc code=end
