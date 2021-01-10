/*
 * @Author: Oliver Seth 
 * @Date: 2021-01-09 13:41:42 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2021-01-09 13:41:42 
 */
/*
 * @lc app=leetcode.cn id=1662 lang=java
 *
 * [1662] 检查两个字符串数组是否相等
 */

// @lc code=start
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (String word : word1) {
            sb1.append(word);
        }
        for (String word : word2) {
            sb2.append(word);
        }
        return sb1.toString().equals(sb2.toString());
    }
}
// @lc code=end

