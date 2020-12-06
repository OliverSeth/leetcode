/*
 * @Author: Oliver Seth 
 * @Date: 2020-12-05 13:42:51 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-12-05 13:42:51 
 */
/*
 * @lc app=leetcode.cn id=1492 lang=java
 *
 * [1492] n 的第 k 个因子
 */

// @lc code=start
class Solution {
    public int kthFactor(int n, int k) {
        int sq = (int) Math.sqrt(n);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 2; i <= sq; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        int cnt = list.size() * 2;
        if (n == sq * sq) {
            cnt--;
        }
        if (k > cnt) {
            return -1;
        }
        if (k <= list.size()) {
            return list.get(k - 1);
        }
        return n / list.get(cnt - k);
    }
}
// @lc code=end

