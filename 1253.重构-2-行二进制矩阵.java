/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-27 13:08:45 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-27 13:08:45 
 */
/*
 * @lc app=leetcode.cn id=1253 lang=java
 *
 * [1253] 重构 2 行二进制矩阵
 */

// @lc code=start
class Solution {
    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> up = new ArrayList<>();
        int upsum = 0;
        List<Integer> low = new ArrayList<>();
        int lowsum = 0;
        for (int i = 0; i < colsum.length; i++) {
            if (colsum[i] + upsum <= upper) {
                upsum += colsum[i];
                up.add(colsum[i]);
                low.add(0);
            } else {
                up.add(upper - upsum);
                low.add(colsum[i] - upper + upsum);
                lowsum += colsum[i] - upper + upsum;
                upsum = upper;
            }
        }
        if (upsum == upper && lowsum == lower) {
            res.add(up);
            res.add(low);
        }
        return res;
    }
}
// @lc code=end
