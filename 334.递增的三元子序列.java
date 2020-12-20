/*
 * @Author: Oliver Seth 
 * @Date: 2020-12-19 12:41:19 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-12-19 12:41:19 
 */
/*
 * @lc app=leetcode.cn id=334 lang=java
 *
 * [334] 递增的三元子序列
 */

// @lc code=start
class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3) {
            return false;
        }
        int left = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= left) {
                left = num;
            } else if (num <= mid) {
                mid = num;
            } else {
                return true;
            }
        }
        return false;
    }
}
// @lc code=end

