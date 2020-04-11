/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-11 17:23:33 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-11 17:23:33 
 */
/*
 * @lc app=leetcode.cn id=1323 lang=java
 *
 * [1323] 6 和 9 组成的最大数字
 */

// @lc code=start
class Solution {
    public int maximum69Number(int num) {
        String rowNum = String.valueOf(num);
        StringBuilder newNum = new StringBuilder();
        boolean isFirst = true;
        for (int i = 0; i < rowNum.length(); i++) {
            if (rowNum.charAt(i) == '6' && isFirst) {
                isFirst = false;
                newNum.append('9');
            } else {
                newNum.append(rowNum.charAt(i));
            }
        }
        return Integer.parseInt(newNum.toString());
    }
}
// @lc code=end
