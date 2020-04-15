/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-15 11:51:25 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-15 11:51:25 
 */
/*
 * @lc app=leetcode.cn id=1304 lang=java
 *
 * [1304] 和为零的N个唯一整数
 */

// @lc code=start
class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int cnt = 1;
        for (int i = 0; i < n / 2 * 2; i++) {
            res[i++] = cnt;
            res[i] = -cnt;
            cnt++;
        }
        if (n % 2 != 0) {
            res[n - 1] = 0;
        }
        return res;
    }
}
// @lc code=end
