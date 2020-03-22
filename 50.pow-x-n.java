/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-22 17:13:41 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-03-22 17:13:41 
 */
/*
 * @lc app=leetcode.cn id=50 lang=java
 *
 * [50] Pow(x, n)
 */

// @lc code=start
class Solution {
    public double myPow(double x, int n) {
        long m = n;
        if (n < 0) {
            x = 1 / x;
            m = -m;
        }
        return helper(x, m);
    }

    public double helper(double x, long n) {
        if (n == 0) {
            return 1;
        }
        double half = helper(x, n / 2);
        if (n % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}
// @lc code=end
