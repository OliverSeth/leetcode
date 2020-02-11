/*
 * @Author: Oliver Seth
 * @Date: 2020-02-10 23:34:17
 * @Last Modified by:   Oliver Seth
 * @Last Modified time: 2020-02-10 23:34:17
 */
class Solution {
    private int pos = -1;

    public int search(int[] nums, int target) {
        helper(nums, target, 0, nums.length - 1);
        return pos;
    }

    private void helper(int[] nums, int target, int start, int end) {
        if (start > end) {
            return;
        }
        int middle = (start + end) / 2;
        if (nums[middle] == target) {
            pos = middle;
            return;
        }
        if (isAscend(nums, start, middle)) {
            if (nums[middle] > target && nums[start] <= target) {
                ascendHelper(nums, target, start, middle-1);
            } else {
                helper(nums, target, middle+1, end);
            }
        } else {
            if (nums[middle] < target && nums[end] >= target) {
                ascendHelper(nums, target, middle+1, end);
            } else {
                helper(nums, target, start, middle-1);
            }
        }
    }

    private boolean isAscend(int[] nums, int start, int end) {
        return nums[start] <= nums[end];
    }

    private void ascendHelper(int[] nums, int target, int start, int end) {
        if (start > end) {
            return;
        }
        int middle = (start + end) / 2;
        if (nums[middle] == target) {
            pos = middle;
        } else if (nums[middle] < target) {
            ascendHelper(nums, target, middle + 1, end);
        } else {
            ascendHelper(nums, target, start, middle - 1);
        }
    }
}
