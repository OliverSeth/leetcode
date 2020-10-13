/*
 * @Author: Oliver Seth 
 * @Date: 2020-10-13 08:53:54 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-10-13 08:53:54 
 */
/*
 * @lc app=leetcode.cn id=859 lang=java
 *
 * [859] 亲密字符串
 */

// @lc code=start
class Solution {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        int cnt = 0;
        int p = -1, q = -1;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                cnt++;
                if (cnt > 2) {
                    return false;
                }
                if (p != -1) {
                    q = i;
                } else {
                    p = i;
                }
            }
        }
        if (cnt == 2) {
            if (A.charAt(p) == B.charAt(q) && A.charAt(q) == B.charAt(p)) {
                return true;
            }
        } else if (cnt == 0) {
            boolean[] existed = new boolean[26];
            for (int i = 0; i < A.length(); i++) {
                if (existed[A.charAt(i) - 'a']) {
                    return true;
                } else {
                    existed[A.charAt(i) - 'a'] = true;
                }
            }
        }
        return false;
    }
}
// @lc code=end

