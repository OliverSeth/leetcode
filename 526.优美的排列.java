/*
 * @Author: Oliver Seth 
 * @Date: 2021-01-04 12:49:36 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2021-01-04 12:49:36 
 */
/*
 * @lc app=leetcode.cn id=526 lang=java
 *
 * [526] 优美的排列
 */

// @lc code=start
class Solution {
    private int cnt = 0;

    public int countArrangement(int n) {
        helper(new boolean[n], 0, n);
        return cnt;
    }

    private void helper(boolean[] visited, int pos, int n) {
        if (pos >= n) {
            cnt++;
            return;
        }
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i] && ((i + 1) % (pos + 1) == 0 || (pos + 1) % (i + 1) == 0)) {
                visited[i] = true;
                helper(visited, pos + 1, n);
                visited[i] = false;
            }
        }
    }
}
// @lc code=end

