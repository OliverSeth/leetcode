/*
 * @Author: Oliver Seth 
 * @Date: 2020-11-12 09:09:15 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-11-12 09:09:15 
 */
/*
 * @lc app=leetcode.cn id=922 lang=java
 *
 * [922] 按奇偶排序数组 II
 */

// @lc code=start
class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int p = 0;
        int q = 1;
        while (p < A.length && q < A.length) {
            while (p < A.length && A[p] % 2 == 0) {
                p += 2;
            }
            while (q < A.length && A[q] % 2 == 1) {
                q += 2;
            }
            if (p < A.length && q < A.length) {
                int tmp = A[p];
                A[p] = A[q];
                A[q] = tmp;
            }
        }
        return A;
    }
}
// @lc code=end

