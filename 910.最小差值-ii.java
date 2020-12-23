/*
 * @Author: Oliver Seth 
 * @Date: 2020-12-22 12:55:40 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-12-22 12:55:40 
 */
/*
 * @lc app=leetcode.cn id=910 lang=java
 *
 * [910] 最小差值 II
 */

// @lc code=start
class Solution {
    public int smallestRangeII(int[] A, int K) {
        Arrays.sort(A);
        int minRan = A[A.length - 1] - A[0];
        for (int i = 0; i < A.length - 1; i++) {
            minRan = Math.min(minRan, Math.max(A[A.length - 1] - K, A[i] + K) - Math.min(A[0] + K, A[i + 1] - K));
        }
        return minRan;
    }
}
// @lc code=end

