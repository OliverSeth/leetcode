/*
 * @Author: Oliver Seth 
 * @Date: 2020-11-19 11:43:49 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-11-19 11:46:51
 */
/*
 * @lc app=leetcode.cn id=283 lang=java
 *
 * [283] 移动零
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                cnt++;
            } else {
                nums[i - cnt] = nums[i];
            }
        }
        for (int i = nums.length - 1; i >= nums.length - cnt; i--) {
            nums[i] = 0;
        }
    }
}
// @lc code=end

