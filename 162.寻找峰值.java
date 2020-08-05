/*
 * @Author: Oliver Seth 
 * @Date: 2020-08-05 13:40:19 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-08-05 13:40:19 
 */
class Solution {
    public int findPeakElement(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    private int helper(int[] nums, int start, int end) {
        if (start == end) {
            return start;
        }
        int mid = (start + end) / 2;
        if (nums[mid] > nums[mid + 1]) {
            return helper(nums, start, mid);
        } else {
            return helper(nums, mid + 1, end);
        }
    }
}