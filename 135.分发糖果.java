/*
 * @Author: Oliver Seth 
 * @Date: 2020-12-24 13:23:41 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-12-24 13:23:41 
 */
/*
 * @lc app=leetcode.cn id=135 lang=java
 *
 * [135] 分发糖果
 */

// @lc code=start
class Solution {
    public int candy(int[] ratings) {
        int[] num = new int[ratings.length];
        num[0] = 1;
        for (int i = 1; i < num.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                num[i] = num[i - 1] + 1;
            } else {
                num[i] = 1;
            }
        }
        int cur = 1;
        int all = num[num.length - 1];
        for (int i = num.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                cur++;
            } else {
                cur = 1;
            }
            all += Math.max(num[i], cur);
        }
        return all;
    }
}
// @lc code=end

