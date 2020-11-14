/*
 * @Author: Oliver Seth 
 * @Date: 2020-11-12 09:03:53 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-11-12 09:03:53 
 */
/*
 * @lc app=leetcode.cn id=593 lang=java
 *
 * [593] 有效的正方形
 */

// @lc code=start
class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        if (isSame(p1, p2) || isSame(p1, p3) || isSame(p1, p4)) {
            return false;
        }
        int[] len = new int[6];
        helper(p1, p2, len, 0);
        helper(p1, p3, len, 1);
        helper(p1, p4, len, 2);
        helper(p2, p3, len, 3);
        helper(p2, p4, len, 4);
        helper(p3, p4, len, 5);
        Arrays.sort(len);
        return len[0] == len[1] && len[1] == len[2] && len[2] == len[3] && len[4] == len[5] && len[0] + len[1] == len[5];
    }

    private boolean isSame(int[] p1, int[] p2) {
        return p1[0] == p2[0] && p1[1] == p2[1];
    }

    private void helper(int[] p1, int[] p2, int[] len, int pos) {
        len[pos] = (p2[0] - p1[0]) * (p2[0] - p1[0]) + (p2[1] - p1[1]) * (p2[1] - p1[1]);
    }
}
// @lc code=end

