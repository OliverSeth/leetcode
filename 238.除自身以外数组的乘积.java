/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-14 16:46:14 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-03-14 16:50:44
 */
/*
 * @lc app=leetcode.cn id=238 lang=java
 *
 * [238] 除自身以外数组的乘积
 */

// @lc code=start
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                res[i] = 1;
            } else {
                res[i] = nums[i - 1] * res[i - 1];
            }
        }
        int ans = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            ans *= nums[i + 1];
            res[i] *= ans;
        }
        return res;
    }
}
// @lc code=end
