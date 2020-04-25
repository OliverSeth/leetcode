/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-25 14:28:55 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-25 14:28:55 
 */
/*
 * @lc app=leetcode.cn id=1260 lang=java
 *
 * [1260] 二维网格迁移
 */

// @lc code=start
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<Integer> all = new ArrayList<>();
        for (int[] ints : grid) {
            for (int j = 0; j < grid[0].length; j++) {
                all.add(ints[j]);
            }
        }
        k %= all.size();
        List<List<Integer>> res = new ArrayList<>();
        int ans = all.size() - k;
        for (int i = 0; i < grid.length; i++) {
            List<Integer> one = new ArrayList<>();
            for (int j = 0; j < grid[0].length; j++) {
                if (ans == all.size()) {
                    ans = 0;
                }
                one.add(all.get(ans++));
            }
            res.add(one);
        }
        return res;
    }
}
// @lc code=end
