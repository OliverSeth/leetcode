/*
 * @Author: Oliver Seth 
 * @Date: 2021-01-07 12:57:50 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2021-01-07 12:57:50 
 */
/*
 * @lc app=leetcode.cn id=1539 lang=java
 *
 * [1539] 第 k 个缺失的正整数
 */

// @lc code=start
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int cnt = 1;
        for (int i = 0; i < arr.length; i++) {
            if (cnt != arr[i]) {
                i--;
                k--;
            }
            if (k == 0) {
                return cnt;
            }
            cnt++;
        }
        cnt += k - 1;
        return cnt;
    }
}
// @lc code=end

