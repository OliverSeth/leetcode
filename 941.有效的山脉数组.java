/*
 * @Author: Oliver Seth 
 * @Date: 2020-11-03 08:46:06 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-11-03 08:46:06 
 */
/*
 * @lc app=leetcode.cn id=941 lang=java
 *
 * [941] 有效的山脉数组
 */

// @lc code=start
class Solution {
    public boolean validMountainArray(int[] A) {
        if (A.length < 3 || A[0] > A[1]) {
            return false;
        }
        boolean isUp = true;
        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] == A[i]) {
                return false;
            } else if (A[i - 1] < A[i]) {
                if (!isUp) {
                    return false;
                }
            } else {
                if (isUp) {
                    isUp = false;
                }
            }
        }
        return !isUp;
    }
}
// @lc code=end

