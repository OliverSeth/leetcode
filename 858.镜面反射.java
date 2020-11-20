/*
 * @Author: Oliver Seth 
 * @Date: 2020-11-18 18:49:53 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-11-18 18:49:53 
 */
/*
 * @lc app=leetcode.cn id=858 lang=java
 *
 * [858] 镜面反射
 */

// @lc code=start
class Solution {
    public int mirrorReflection(int p, int q) {
        int g = gcd(p, q);
        return q / g % 2 == 0 ? 0 : p / g % 2 == 0 ? 2 : 1;
    }

    private int gcd(int p, int q) {
        if (p % q == 0) {
            return q;
        } else {
            return gcd(q, p % q);
        }
    }
}
// @lc code=end

