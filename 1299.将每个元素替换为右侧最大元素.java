/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-16 11:50:21 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-16 11:50:21 
 */
/*
 * @lc app=leetcode.cn id=1299 lang=java
 *
 * [1299] 将每个元素替换为右侧最大元素
 */

// @lc code=start
class Solution {
    public int[] replaceElements(int[] arr) {
        int[] res = new int[arr.length];
        res[res.length - 1] = -1;
        for (int i = res.length - 2; i >= 0; i--) {
            res[i] = Math.max(res[i + 1], arr[i + 1]);
        }
        return res;
    }
}
// @lc code=end
