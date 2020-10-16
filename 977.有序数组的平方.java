/*
 * @Author: Oliver Seth 
 * @Date: 2020-10-16 10:46:22 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-10-16 10:46:22 
 */
/*
 * @lc app=leetcode.cn id=977 lang=java
 *
 * [977] 有序数组的平方
 */

// @lc code=start
class Solution {
    public int[] sortedSquares(int[] A) {
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i] * A[i];
        }
        Arrays.sort(B);
        return B;
    }
}
// @lc code=end

