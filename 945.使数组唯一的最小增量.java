/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-22 17:20:30 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-03-22 17:21:39
 */
import java.util.Arrays;

/*
 * @lc app=leetcode.cn id=945 lang=java
 *
 * [945] 使数组唯一的最小增量
 */

// @lc code=start
class Solution {
    public int minIncrementForUnique(int[] A) {
        Arrays.sort(A);
        int cnt = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[i - 1]) {
                continue;
            }
            cnt += A[i - 1] + 1 - A[i];
            A[i] = A[i - 1] + 1;
        }
        return cnt;
    }
}
// @lc code=end
