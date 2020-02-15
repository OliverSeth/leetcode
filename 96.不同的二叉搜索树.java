/*
 * @Author: Oliver Seth 
 * @Date: 2020-02-15 15:26:34 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-02-15 15:33:42
 */
/*
 * @lc app=leetcode.cn id=96 lang=java
 *
 * [96] 不同的二叉搜索树
 */

// @lc code=start
class Solution {
    public int numTrees(int n) {
        if (n == 0) {
            return 1;
        }
        int[] nums = new int[n + 1];
        nums[0] = 1;
        nums[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                nums[i] += nums[j] * nums[i - 1 - j];
            }
        }
        return nums[n];
    }
}
// @lc code=end
