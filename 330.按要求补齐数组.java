/*
 * @Author: Oliver Seth 
 * @Date: 2020-12-29 11:29:21 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-12-29 11:29:21 
 */
/*
 * @lc app=leetcode.cn id=330 lang=java
 *
 * [330] 按要求补齐数组
 */

// @lc code=start
class Solution {
    public int minPatches(int[] nums, int n) {
        int cnt = 0;
        long cur = 1;
        int pos = 0;
        while (cur <= n) {
            if (pos < nums.length && nums[pos] <= cur) {
                cur += nums[pos];
                pos++;
            } else {
                cur *= 2;
                cnt++;
            }
        }
        return cnt;
    }
}
// @lc code=end

