/*
 * @Author: Oliver Seth 
 * @Date: 2020-10-10 10:27:39 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-10-10 10:27:39 
 */
/*
 * @lc app=leetcode.cn id=75 lang=java
 *
 * [75] 颜色分类
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            while (left < nums.length && nums[left] == 0) {
                left++;
            }
            while (right >= 0 && nums[right] != 0) {
                right--;
            }
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        left = 0;
        right = nums.length - 1;
        while (left < right) {
            while (left < nums.length && nums[left] <= 1) {
                left++;
            }
            while (right >= 0 && nums[right] == 2) {
                right--;
            }
            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
    }
}
// @lc code=end

