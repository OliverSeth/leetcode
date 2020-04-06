/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-06 22:53:48 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-06 22:53:48 
 */
/*
 * @lc app=leetcode.cn id=1403 lang=java
 *
 * [1403] 非递增顺序的最小子序列
 */

// @lc code=start
class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int rightSum = 0;
        int i = nums.length - 1;
        for (; i >= 0 && 2 * rightSum <= sum; i--) {
            rightSum += nums[i];
        }
        List<Integer> res = new ArrayList<>();
        for (int j = nums.length - 1; j > i; j--) {
            res.add(nums[j]);
        }
        return res;
    }
}
// @lc code=end
