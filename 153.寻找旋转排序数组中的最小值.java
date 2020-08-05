/*
 * @Author: Oliver Seth 
 * @Date: 2020-08-05 13:29:03 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-08-05 13:29:03 
 */
/*
 * @lc app=leetcode.cn id=153 lang=java
 *
 * [153] 寻找旋转排序数组中的最小值
 */

// @lc code=start
class Solution {
    public int findMin(int[] nums) {
        if (nums.length == 1 || nums[0] < nums[nums.length - 1]) {
            return nums[0];
        }
        return helper(nums, 0, nums.length - 1);
    }

    private int helper(int[] nums, int start, int end) {
        if (start == end - 1) {
            return Math.min(nums[start], nums[end]);
        }
        int mid = (start + end) / 2;
        if (nums[start] < nums[mid]) {
            return helper(nums, mid, end);
        } else {
            return helper(nums, start, mid);
        }
    }
}
// @lc code=end
