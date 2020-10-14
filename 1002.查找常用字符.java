/*
 * @Author: Oliver Seth 
 * @Date: 2020-10-14 10:22:03 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-10-14 10:22:03 
 */
/*
 * @lc app=leetcode.cn id=1002 lang=java
 *
 * [1002] 查找常用字符
 */

// @lc code=start
class Solution {
    public List<String> commonChars(String[] A) {
        int[][] charNum = new int[A.length][26];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length(); j++) {
                charNum[i][A[i].charAt(j) - 'a']++;
            }
        }
        List<String> res = new ArrayList<>();
        for (int j = 0; j < 26; j++) {
            for (int i = 1; i < A.length; i++) {
                charNum[0][j] = Math.min(charNum[0][j], charNum[i][j]);
            }
            for (int i = 0; i < charNum[0][j]; i++) {
                res.add(String.valueOf((char) ('a' + j)));
            }
        }
        return res;
    }
}
// @lc code=end

