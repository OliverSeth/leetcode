/*
 * @Author: Oliver Seth 
 * @Date: 2020-10-25 12:46:33 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-10-25 12:46:33 
 */
/*
 * @lc app=leetcode.cn id=948 lang=java
 *
 * [948] 令牌放置
 */

// @lc code=start
class Solution {
    public int bagOfTokensScore(int[] tokens, int P) {
        Arrays.sort(tokens);
        int score = 0;
        int left = 0;
        int right = tokens.length;
        while (left < right) {
            if (score > 0 && right > left + 1) {
                score--;
                right--;
                P += tokens[right];
            }
            while (left < right && P >= tokens[left]) {
                P -= tokens[left];
                score++;
                left++;
            }
            if (score == 0 || right <= left + 1) {
                break;
            }
        }
        return score;
    }
}
// @lc code=end

