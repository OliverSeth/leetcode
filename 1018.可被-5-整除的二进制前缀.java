/*
 * @Author: Oliver Seth 
 * @Date: 2021-01-14 14:24:54 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2021-01-14 14:24:54 
 */
/*
 * @lc app=leetcode.cn id=1018 lang=java
 *
 * [1018] 可被 5 整除的二进制前缀
 */

// @lc code=start
class Solution {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> res = new ArrayList<>();
        int num = 0;
        for (int i = 0; i < A.length; i++) {
            num = (num * 2 + A[i]) % 5;
            res.add(num % 5 == 0);
        }
        return res;
    }
}
// @lc code=end

