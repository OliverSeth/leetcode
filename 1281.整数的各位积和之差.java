/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-21 11:42:26 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-21 11:42:26 
 */
/*
 * @lc app=leetcode.cn id=1281 lang=java
 *
 * [1281] 整数的各位积和之差
 */

// @lc code=start
class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            product *= n % 10;
            n /= 10;
        }
        return product - sum;
    }
}
// @lc code=end
