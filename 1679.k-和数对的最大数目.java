/*
 * @Author: Oliver Seth 
 * @Date: 2021-01-19 13:05:20 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2021-01-19 13:05:20 
 */
/*
 * @lc app=leetcode.cn id=1679 lang=java
 *
 * [1679] K 和数对的最大数目
 */

// @lc code=start
class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int cnt = 0;
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] == k) {
                cnt++;
                left++;
                right--;
            } else if (nums[left] + nums[right] < k) {
                left++;
            } else {
                right--;
            }
        }
        return cnt;
    }
}
// @lc code=end

