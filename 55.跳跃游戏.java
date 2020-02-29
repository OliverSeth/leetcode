/*
 * @Author: Oliver Seth 
 * @Date: 2020-02-29 14:18:24 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-02-29 14:21:01
 */
/*
 * @lc app=leetcode.cn id=55 lang=java
 *
 * [55] 跳跃游戏
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        int pos = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= pos) {
                pos = i;
            }
        }
        return pos == 0;
    }
}
// @lc code=end
