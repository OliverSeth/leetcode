import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * @Author: Oliver Seth 
 * @Date: 2020-02-25 17:20:49 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-02-25 20:57:44
 */
/*
 * @lc app=leetcode.cn id=151 lang=java
 *
 * [151] 翻转字符串里的单词
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        List<String> input = Arrays.asList(s.trim().split("\\s+"));
        Collections.reverse(input);
        return String.join(" ", input);
    }
}
// @lc code=end
