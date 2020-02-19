/*
 * @Author: Oliver Seth 
 * @Date: 2020-02-19 17:49:40 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-02-19 18:33:13
 */
/*
 * @lc app=leetcode.cn id=31 lang=java
 *
 * [31] 下一个排列
 */

// @lc code=start
class Solution {
    public void nextPermutation(int[] nums) {
        if (nums.length <= 1) {
            return;
        }
        int i;
        int j;
        int k = nums.length - 1;
        for (i = nums.length - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                break;
            }
        }
        if (i == 0) {
            for (j = 0; j < k; j++) {
                nums[j] ^= nums[k];
                nums[k] ^= nums[j];
                nums[j] ^= nums[k];
                k--;
            }
            return;
        }
        for (j = i + 1; j < nums.length; j++) {
            if (nums[j] <= nums[i-1]) {
                break;
            }
        }
        nums[i - 1] ^= nums[j - 1];
        nums[j - 1] ^= nums[i - 1];
        nums[i - 1] ^= nums[j - 1];
        for (j = i; j < k; j++) {
            nums[j] ^= nums[k];
            nums[k] ^= nums[j];
            nums[j] ^= nums[k];
            k--;
        }
    }
}
// @lc code=end
