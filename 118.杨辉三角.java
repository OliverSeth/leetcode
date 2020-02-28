import java.util.ArrayList;
import java.util.List;

/*
 * @Author: Oliver Seth 
 * @Date: 2020-02-28 21:29:25 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-02-28 21:45:25
 */
/*
 * @lc app=leetcode.cn id=118 lang=java
 *
 * [118] 杨辉三角
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> one = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    one.add(1);
                } else {
                    one.add(res.get(res.size() - 1).get(j - 1) + res.get(res.size() - 1).get(j));
                }
            }
            res.add(one);
        }
        return res;
    }
}
// @lc code=end
