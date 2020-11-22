/*
 * @Author: Oliver Seth 
 * @Date: 2020-11-21 16:16:13 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-11-21 16:18:01
 */
/*
 * @lc app=leetcode.cn id=81 lang=java
 *
 * [81] 搜索旋转排序数组 II
 */

// @lc code=start
class Solution {
    public boolean search(int[] nums, int target) {
        return helper(nums, target, 0, nums.length - 1);
    }

    private boolean helper(int[] nums, int target, int start, int end) {
        if (start > end) {
            return false;
        }
        if (start == end || nums[start] < nums[end]) {
            return binarySearch(nums, target, start, end);
        } else {
            int middle = (start + end) / 2;
            return helper(nums, target, start, middle) || helper(nums, target, middle + 1, end);
        }
    }

    private boolean binarySearch(int[] nums, int target, int start, int end) {
        if (start == end) {
            if (nums[start] == target) {
                return true;
            } else {
                return false;
            }
        }
        if (nums[start] > target || nums[end] < target) {
            return false;
        }
        int middle = (start + end) / 2;
        if (nums[middle] >= target) {
            return binarySearch(nums, target, start, middle);
        } else {
            return binarySearch(nums, target, middle + 1, end);
        }
    }
}
// @lc code=end

