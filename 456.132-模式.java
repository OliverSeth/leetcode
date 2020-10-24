/*
 * @Author: Oliver Seth 
 * @Date: 2020-10-24 13:00:44 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-10-24 13:00:44 
 */
/*
 * @lc app=leetcode.cn id=456 lang=java
 *
 * [456] 132模式
 */

// @lc code=start
class Solution {
    public boolean find132pattern(int[] nums) {
        int[] minNums = new int[nums.length];
        minNums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            minNums[i] = Math.min(minNums[i - 1], nums[i]);
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (minNums[i] == nums[i]) {
                continue;
            }
            while (!stack.isEmpty() && stack.peek() <= minNums[i]) {
                stack.pop();
            }
            if (!stack.isEmpty() && stack.peek() < nums[i]) {
                return true;
            }
            stack.push(nums[i]);
        }
        return false;
    }
}
// @lc code=end

