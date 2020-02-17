/*
 * @Author: Oliver Seth 
 * @Date: 2020-02-17 14:54:35 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-02-17 15:18:34
 */
/*
 * @lc app=leetcode.cn id=60 lang=java
 *
 * [60] 第k个排列
 */

// @lc code=start
class Solution {
    public String getPermutation(int n, int k) {
        boolean[] used = new boolean[n];
        List<String> res = new ArrayList<>();
        backTrack(res, new StringBuilder(), n, k, used);
        return res.get(k - 1);
    }

    private void backTrack(List<String> res, StringBuilder one, int n, int k, boolean[] used) {
        if (one.length() == n) {
            res.add(one.toString());
            return;
        }
        if (res.size() == k) {
            return;
        }
        for (int i = 0; i < n; i++) {
            if (used[i]) {
                continue;
            }
            one.append(String.valueOf(i + 1));
            used[i] = true;
            backTrack(res, one, n, k, used);
            used[i] = false;
            one.deleteCharAt(one.length() - 1);
            if (res.size() == k) {
                return;
            }
        }
    }
}
// @lc code=end
