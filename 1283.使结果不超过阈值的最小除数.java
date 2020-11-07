/*
 * @Author: Oliver Seth 
 * @Date: 2020-11-07 14:44:16 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-11-07 14:44:16 
 */
/*
 * @lc app=leetcode.cn id=1283 lang=java
 *
 * [1283] 使结果不超过阈值的最小除数
 */

// @lc code=start
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int maxNum = 0;
        for (int num : nums) {
            maxNum = Math.max(maxNum, num);
        }
        return helper(nums, threshold, 1, maxNum);
    }

    private int helper(int[] nums, int threshold, int start, int end) {
        if (start == end) {
            return start;
        }
        int middle = (start + end) / 2;
        int divSum = 0;
        for (int num : nums) {
            if (num % middle == 0) {
                divSum += num / middle;
            } else {
                divSum += num / middle + 1;
            }
        }
        if (divSum > threshold) {
            return helper(nums, threshold, middle + 1, end);
        } else {
            return helper(nums, threshold, start, middle);
        }
    }
}
// @lc code=end

