/*
 * @Author: Oliver Seth 
 * @Date: 2020-10-08 16:18:09 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-10-08 16:18:09 
 */
/*
 * @lc app=leetcode.cn id=93 lang=java
 *
 * [93] 复原IP地址
 */

// @lc code=start
class Solution {
    List<String> res = new ArrayList<>();
    List<Integer> num = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        helper(s, 0, 0);
        return res;
    }

    private void helper(String s, int seg, int pos) {
        if (seg == 4 && pos == s.length()) {
            StringBuilder sb = new StringBuilder(String.valueOf(num.get(0)));
            for (int i = 1; i < 4; i++) {
                sb.append('.');
                sb.append(num.get(i));
            }
            res.add(sb.toString());
            return;
        }
        if (pos == s.length() || num.size() == 4) {
            return;
        }
        if (s.charAt(pos) == '0') {
            num.add(0);
            helper(s, seg + 1, pos + 1);
            num.remove(num.size() - 1);
            return;
        }
        int temp = 0;
        for (int i = pos; i < s.length(); i++) {
            temp = temp * 10 + s.charAt(i) - '0';
            if (temp > 0 && temp <= 255) {
                num.add(temp);
                helper(s, seg + 1, i + 1);
                num.remove(num.size() - 1);
            } else {
                break;
            }
        }
    }
}
// @lc code=end

