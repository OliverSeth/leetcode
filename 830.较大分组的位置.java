/*
 * @Author: Oliver Seth 
 * @Date: 2021-01-05 10:33:34 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2021-01-05 10:33:34 
 */
/*
 * @lc app=leetcode.cn id=830 lang=java
 *
 * [830] 较大分组的位置
 */

// @lc code=start
class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        int left = 0;
        for (int i = 1; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) != s.charAt(i - 1)) {
                if (i - left >= 3) {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(left);
                    tmp.add(i - 1);
                    res.add(tmp);
                }
                left = i;
            }
        }
        return res;
    }
}
// @lc code=end

