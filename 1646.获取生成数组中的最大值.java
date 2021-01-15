/*
 * @Author: Oliver Seth 
 * @Date: 2021-01-15 21:54:02 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2021-01-15 21:54:02 
 */
/*
 * @lc app=leetcode.cn id=1646 lang=java
 *
 * [1646] 获取生成数组中的最大值
 */

// @lc code=start
class Solution {
    public int getMaximumGenerated(int n) {
        int[] arr = new int[n + 1];
        if (n == 0) {
            return 0;
        }
        arr[0] = 0;
        arr[1] = 1;
        int maxNum = 1;
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                arr[i] = arr[i / 2];
            } else {
                arr[i] = arr[i / 2] + arr[i / 2 + 1];
            }
            maxNum = Math.max(maxNum, arr[i]);
        }
        return maxNum;
    }
}
// @lc code=end

