/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-26 16:17:41 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-03-26 16:17:41 
 */
/*
 * @lc app=leetcode.cn id=1390 lang=java
 *
 * [1390] 四因数
 */

// @lc code=start
class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            int cnt = 1;
            int divisor = 0;
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    divisor = j;
                    cnt++;
                }
                if (cnt > 2) {
                    break;
                }
            }
            if (cnt == 2 && divisor != Math.sqrt(num)) {
                sum += 1 + num + divisor + num / divisor;
            }
        }
        return sum;
    }
}
// @lc code=end

