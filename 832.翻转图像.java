/*
 * @Author: Oliver Seth 
 * @Date: 2020-11-11 09:46:54 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-11-11 09:46:54 
 */
/*
 * @lc app=leetcode.cn id=832 lang=java
 *
 * [832] 翻转图像
 */

// @lc code=start
class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            int left = 0;
            int right = A[0].length - 1;
            while (left < right) {
                int tmp = A[i][left];
                A[i][left] = 1 - A[i][right];
                A[i][right] = 1 - tmp;
                left++;
                right--;
            }
            if (left == right) {
                A[i][left] = 1 - A[i][left];
            }
        }
        return A;
    }
}
// @lc code=end

