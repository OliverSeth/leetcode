/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-04 18:52:18 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-03-04 19:28:41
 */
/*
 * @lc app=leetcode.cn id=80 lang=java
 *
 * [80] 删除排序数组中的重复项 II
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int cnt = 0;
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                if (cnt == 2) {
                    nums = remove(nums, i + 1);
                    len--;
                    i--;
                } else {
                    cnt = 2;
                }
            } else {
                cnt = 0;
            }
        }
        return len;
    }

    private int[] remove(int[] nums, int index) {
        for (int i = index; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        return nums;
    }
}
// @lc code=end
