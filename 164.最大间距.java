import java.util.Arrays;

/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-16 20:04:39 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-03-16 20:07:35
 */
/*
 * @lc app=leetcode.cn id=164 lang=java
 *
 * [164] 最大间距
 */

// @lc code=start
class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int maxGap = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxGap = Math.max(maxGap, nums[i + 1] - nums[i]);
        }
        return maxGap;
    }
}
// @lc code=end
