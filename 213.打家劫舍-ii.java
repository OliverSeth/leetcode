/*
 * @Author: Oliver Seth 
 * @Date: 2020-10-14 23:07:12 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-10-14 23:07:12 
 */
/*
 * @lc app=leetcode.cn id=213 lang=java
 *
 * [213] 打家劫舍 II
 */

// @lc code=start
class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        } else if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        return Math.max(helper(nums, 0, nums.length - 1), helper(nums, 1, nums.length));
    }

    private int helper(int[] nums, int start, int end) {
        int left = 0;
        int right = 0;
        for (int i = start; i < end; i++) {
            int temp = right;
            right = Math.max(right, left + nums[i]);
            left = temp;
        }
        return right;
    }
}
// @lc code=end

