/*
 * @Author: Oliver Seth 
 * @Date: 2020-10-29 08:10:18 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-10-29 08:10:18 
 */
/*
 * @lc app=leetcode.cn id=228 lang=java
 *
 * [228] 汇总区间
 */

// @lc code=start
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();
        int left = 0;
        int tmp = 0;
        int right = tmp + 1;
        while (right <= nums.length) {
            if (right == nums.length || nums[right] > nums[tmp] + 1) {
                if (tmp == left) {
                    res.add(String.valueOf(nums[left]));
                } else {
                    res.add(nums[left] + "->" + nums[tmp]);
                }
                left = right;
                tmp = right - 1;
                if (right == nums.length) {
                    break;
                }
            }
            tmp++;
            right++;

        }
        return res;
    }
}
// @lc code=end

