/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-17 11:41:33 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-17 11:41:33 
 */
/*
 * @lc app=leetcode.cn id=1295 lang=java
 *
 * [1295] 统计位数为偶数的数字
 */

// @lc code=start
class Solution {
    public int findNumbers(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            }
            int len = 0;
            while (nums[i] != 0) {
                nums[i] /= 10;
                len++;
            }
            if (len % 2 == 0) {
                cnt++;
            }
        }
        return cnt;
    }
}
// @lc code=end
