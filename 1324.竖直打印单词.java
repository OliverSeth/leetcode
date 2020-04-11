/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-11 17:24:03 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-11 17:24:03 
 */
/*
 * @lc app=leetcode.cn id=1324 lang=java
 *
 * [1324] 竖直打印单词
 */

// @lc code=start
class Solution {
    public List<String> printVertically(String s) {
        String[] wordList = s.split(" ");
        int maxLen = wordList[0].length();
        for (String value : wordList) {
            maxLen = Math.max(maxLen, value.length());
        }
        List<String> res = new ArrayList<>();
        for (int i = 0; i < maxLen; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = wordList.length - 1; j >= 0; j--) {
                if (i >= wordList[j].length()) {
                    if (sb.length() != 0) {
                        sb.insert(0, ' ');
                    }
                } else {
                    sb.insert(0, wordList[j].charAt(i));
                }
            }
            res.add(sb.toString());
        }
        return res;
    }
}
// @lc code=end
