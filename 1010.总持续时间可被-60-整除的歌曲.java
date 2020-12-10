/*
 * @Author: Oliver Seth 
 * @Date: 2020-12-09 14:06:44 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-12-09 14:06:44 
 */
/*
 * @lc app=leetcode.cn id=1010 lang=java
 *
 * [1010] 总持续时间可被 60 整除的歌曲
 */

// @lc code=start
class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] freq = new int[60];
        for (int t : time) {
            freq[t % 60]++;
        }
        int sum = 0;
        for (int i = 0; i <= 30; i++) {
            if (i == 0 || i == 30) {
                sum += (freq[i] - 1) * freq[i] / 2;
            } else {
                sum += freq[i] * freq[60 - i];
            }
        }
        return sum;
    }
}
// @lc code=end

