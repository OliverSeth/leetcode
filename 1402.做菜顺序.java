/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-18 22:11:40 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-18 22:11:40 
 */
/*
 * @lc app=leetcode.cn id=1402 lang=java
 *
 * [1402] 做菜顺序
 */

// @lc code=start
class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        if (satisfaction[satisfaction.length - 1] <= 0) {
            return 0;
        }
        int[] num = new int[satisfaction.length];
        num[satisfaction.length - 1] = 0;
        for (int i = satisfaction.length - 2; i >= 0; i--) {
            num[i] = num[i + 1] + satisfaction[i + 1];
        }
        int cnt = 0;
        int sum = 0;
        for (int i = 0; i < satisfaction.length; i++) {
            if (satisfaction[i] < -num[i]) {
                cnt++;
            } else {
                sum += satisfaction[i] * (i - cnt + 1);
            }
        }
        return sum;
    }
}
// @lc code=end
