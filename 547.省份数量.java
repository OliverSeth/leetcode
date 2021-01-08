/*
 * @Author: Oliver Seth 
 * @Date: 2021-01-07 13:10:23 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2021-01-07 13:10:23 
 */
/*
 * @lc app=leetcode.cn id=547 lang=java
 *
 * [547] 省份数量
 */

// @lc code=start
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        int[] group = new int[n];
        int index = 1;
        for (int i = 0; i < n; i++) {
            if (group[i] == 0) {
                helper(isConnected, group, i, index++);
            }
        }
        return index - 1;
    }

    private void helper(int[][] isConnected, int[] group, int pos, int index) {
        group[pos] = index;
        for (int i = 0; i < isConnected.length; i++) {
            if (isConnected[pos][i] == 1 && group[i] == 0) {
                helper(isConnected, group, i, index);
            }
        }
    }
}
// @lc code=end

