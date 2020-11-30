/*
 * @Author: Oliver Seth 
 * @Date: 2020-11-29 21:38:46 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-11-29 21:38:46 
 */
/*
 * @lc app=leetcode.cn id=976 lang=java
 *
 * [976] 三角形的最大周长
 */

// @lc code=start
class Solution {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 1; i >= 2; i--) {
            if (A[i - 1] + A[i - 2] > A[i]) {
                return A[i - 1] + A[i - 2] + A[i];
            }
        }
        return 0;
    }
}
// @lc code=end

