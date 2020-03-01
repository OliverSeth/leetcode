import java.util.ArrayList;
import java.util.List;

/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-01 15:04:09 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-03-01 17:58:21
 */
/*
 * @lc app=leetcode.cn id=89 lang=java
 *
 * [89] 格雷编码
 */

// @lc code=start
class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> res = new ArrayList<>();
        res.add(0);
        int ans = 1;
        for (int i = 0; i < n; i++) {
            for (int j = res.size() - 1; j >= 0; j--) {
                res.add(res.get(j) | ans);
            }
            ans <<= 1;
        }
        return res;
    }
}
// @lc code=end
