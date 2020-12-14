/*
 * @Author: Oliver Seth 
 * @Date: 2020-12-13 15:00:40 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-12-13 15:03:00
 */
/*
 * @lc app=leetcode.cn id=217 lang=java
 *
 * [217] 存在重复元素
 */

// @lc code=start
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
}
// @lc code=end

