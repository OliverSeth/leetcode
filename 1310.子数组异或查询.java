/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-14 12:07:56 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-14 12:07:56 
 */
/*
 * @lc app=leetcode.cn id=1310 lang=java
 *
 * [1310] 子数组异或查询
 */

// @lc code=start
class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] xor = new int[arr.length + 1];
        xor[0] = 0;
        for (int i = 1; i <= arr.length; i++) {
            xor[i] = xor[i - 1] ^ arr[i - 1];
        }
        int[] res = new int[queries.length];
        for (int i = 0; i < res.length; i++) {
            res[i] = xor[queries[i][0]] ^ xor[queries[i][1] + 1];
        }
        return res;
    }
}
// @lc code=end
