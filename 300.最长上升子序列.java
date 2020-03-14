/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-14 16:52:14 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-03-14 17:03:12
 */
/*
 * @lc app=leetcode.cn id=300 lang=java
 *
 * [300] 最长上升子序列
 */

// @lc code=start
class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int maxLen = 1;
        int[] res = new int[nums.length];
        res[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    res[i] = Math.max(res[i], res[j] + 1);
                } else {
                    res[i] = Math.max(res[i], 1);
                }
            }
            maxLen = Math.max(maxLen, res[i]);
        }
        return maxLen;
    }
}
// @lc code=end
