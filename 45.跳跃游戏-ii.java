/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-13 16:39:31 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-03-13 17:01:48
 */
/*
 * @lc app=leetcode.cn id=45 lang=java
 *
 * [45] 跳跃游戏 II
 */

// @lc code=start
class Solution {
    public int jump(int[] nums) {
        int end = 0;
        int len = 0;
        int pos = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            pos = Math.max(pos, i + nums[i]);
            if (i == end) {
                end = pos;
                len++;
            }
        }
        return len;
    }
}
// @lc code=end
