/*
 * @Author: Oliver Seth 
 * @Date: 2020-10-20 09:12:24 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-10-20 09:12:24 
 */
/*
 * @lc app=leetcode.cn id=1007 lang=java
 *
 * [1007] 行相等的最少多米诺旋转
 */

// @lc code=start
class Solution {
    public int minDominoRotations(int[] A, int[] B) {
        int tmp = A[0];
        boolean isAll = true;
        for (int i = 1; i < A.length; i++) {
            if (A[i] != tmp && B[i] != tmp) {
                isAll = false;
                break;
            }
        }
        if (!isAll) {
            tmp = B[0];
            isAll = true;
            for (int i = 1; i < A.length; i++) {
                if (A[i] != tmp && B[i] != tmp) {
                    isAll = false;
                    break;
                }
            }
        }
        if (!isAll) {
            return -1;
        }
        int cntA = 0;
        int cntB = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != tmp) {
                cntA++;
            }
            if (B[i] != tmp) {
                cntB++;
            }
        }
        return Math.min(cntA, cntB);
    }
}
// @lc code=end

