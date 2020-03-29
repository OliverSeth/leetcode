/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-29 16:16:43 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-03-29 16:16:43 
 */
/*
 * @lc app=leetcode.cn id=1365 lang=java
 *
 * [1365] 有多少小于当前数字的数字
 */

// @lc code=start
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    res[i]++;
                }
            }
        }
        return res;
    }
}
// @lc code=end

