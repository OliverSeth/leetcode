/*
 * @Author: Oliver Seth 
 * @Date: 2020-11-27 18:50:01 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-11-27 18:50:01 
 */
/*
 * @lc app=leetcode.cn id=454 lang=java
 *
 * [454] 四数相加 II
 */

// @lc code=start
class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> sum = new HashMap();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                sum.put(A[i] + B[j], sum.getOrDefault(A[i] + B[j], 0) + 1);
            }
        }
        int cnt = 0;
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < D.length; j++) {
                cnt += sum.getOrDefault(-C[i] - D[j], 0);
            }
        }
        return cnt;
    }
}
// @lc code=end

