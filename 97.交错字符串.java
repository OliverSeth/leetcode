/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-23 13:32:11 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-03-23 13:52:10
 */
/*
 * @lc app=leetcode.cn id=97 lang=java
 *
 * [97] 交错字符串
 */

// @lc code=start
class Solution {
    private String s1;
    private String s2;
    private String s3;

    public boolean isInterleave(String s1, String s2, String s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        if (s3.length() != s1.length() + s2.length()) {
            return false;
        }
        return helper(0, 0, 0);
    }

    private boolean helper(int i1, int i2, int i3) {
        if (i1 == s1.length()) {
            return s2.substring(i2).equals(s3.substring(i3));
        }
        if (i2 == s2.length()) {
            return s1.substring(i1).equals(s3.substring(i3));
        }
        while (s1.charAt(i1) != s2.charAt(i2)) {
            if (s1.charAt(i1) == s3.charAt(i3)) {
                i1++;
            } else if (s2.charAt(i2) == s3.charAt(i3)) {
                i2++;
            } else {
                return false;
            }
            i3++;
            if (i1 == s1.length()) {
                return s2.substring(i2).equals(s3.substring(i3));
            }
            if (i2 == s2.length()) {
                return s1.substring(i1).equals(s3.substring(i3));
            }
        }
        if (s1.charAt(i1) == s3.charAt(i3) && s2.charAt(i2) == s3.charAt(i3)) {
            return helper(i1 + 1, i2, i3 + 1) || helper(i1, i2 + 1, i3 + 1);
        }
        return false;
    }
}
// @lc code=end
