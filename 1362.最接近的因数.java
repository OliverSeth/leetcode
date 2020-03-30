/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-30 22:21:23 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-03-30 22:21:23 
 */
/*
 * @lc app=leetcode.cn id=1362 lang=java
 *
 * [1362] 最接近的因数
 */

// @lc code=start
class Solution {
    public int[] closestDivisors(int num) {
        num += 1;
        int[] res1 = new int[2];
        int[] res2 = new int[2];
        int dif1 = 0;
        int dif2 = 0;
        for (int i = (int) Math.sqrt(num); i >= 1; i--) {
            if (num % i == 0) {
                dif1 = num / i - i;
                res1[0] = i;
                res1[1] = num / i;
                break;
            }
        }
        num += 1;
        for (int i = (int) Math.sqrt(num); i >= 1; i--) {
            if (num % i == 0) {
                dif2 = num / i - i;
                res2[0] = i;
                res2[1] = num / i;
                break;
            }
        }
        return dif1 < dif2 ? res1 : res2;
    }
}
// @lc code=end

