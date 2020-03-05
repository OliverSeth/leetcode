import java.util.Arrays;

/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-05 18:15:14 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-03-05 18:18:48
 */
/*
 * @lc app=leetcode.cn id=137 lang=java
 *
 * [137] 只出现一次的数字 II
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 3) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}
// @lc code=end
