/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-12 14:09:11 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-03-12 14:20:01
 */
/*
 * @lc app=leetcode.cn id=41 lang=java
 *
 * [41] 缺失的第一个正数
 */

// @lc code=start
class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean isExist = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            return 1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0 || nums[i] > nums.length) {
                nums[i] = 1;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i]) - 1] > 0) {
                nums[Math.abs(nums[i]) - 1] = -nums[Math.abs(nums[i]) - 1];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }
}
// @lc code=end
