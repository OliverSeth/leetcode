/*
 * @Author: Oliver Seth 
 * @Date: 2020-10-25 12:49:03 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-10-25 12:49:03 
 */
/*
 * @lc app=leetcode.cn id=845 lang=java
 *
 * [845] 数组中的最长山脉
 */

// @lc code=start
class Solution {
    public int longestMountain(int[] A) {
        int len = 0;
        int maxLen = 0;
        boolean isUp = true;
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i + 1] < A[i]) {
                if (len != 0) {
                    len++;
                    isUp = false;
                }
            } else if (A[i + 1] == A[i]) {
                if (isUp) {
                    len = 0;
                } else {
                    maxLen = Math.max(maxLen, len);
                    len = 0;
                }
            } else {
                if (isUp) {
                    len++;
                } else {
                    maxLen = Math.max(maxLen, len);
                    len = 1;
                    isUp = true;
                }
            }
        }
        if (!isUp) {
            maxLen = Math.max(maxLen, len);
        }
        return maxLen == 0 ? 0 : maxLen + 1;
    }
}
// @lc code=end

