
/*
 * @Author: Oliver Seth 
 * @Date: 2020-02-28 21:51:00 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-02-28 21:52:23
 */
import java.util.Arrays;
import java.util.List;

/*
 * @Author: Oliver Seth 
 * @Date: 2020-02-28 21:46:17 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-02-28 21:46:17 
 */
/*
 * @lc app=leetcode.cn id=119 lang=java
 *
 * [119] 杨辉三角 II
 */

// @lc code=start
class Solution {
    public List<Integer> getRow(int rowIndex) {
        Integer[] res = new Integer[rowIndex + 1];
        res[0] = 1;
        for (int i = 1; i <= rowIndex; i++) {
            for (int j = i; j >= 0; j--) {
                if (j == i || j == 0) {
                    res[j] = 1;
                } else {
                    res[j] += res[j - 1];
                }
            }
        }
        List<Integer> list = Arrays.asList(res);
        return list;
    }
}
// @lc code=end
