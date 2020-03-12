/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-12 14:22:53 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-03-12 14:33:32
 */
/*
 * @lc app=leetcode.cn id=1071 lang=java
 *
 * [1071] 字符串的最大公因子
 */

// @lc code=start
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (str1.length() > str2.length()) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }
        int len1 = str1.length();
        int len2 = str2.length();
        for (int i = len1; i >= 1; i--) {
            if (len1 % i == 0 && len2 % i == 0) {
                String temp = str1.substring(0, i);
                StringBuilder sb1 = new StringBuilder();
                for (int j = 0; j < len1 / i; j++) {
                    sb1.append(temp);
                }
                if (!str1.equals(sb1.toString())) {
                    continue;
                }
                StringBuilder sb2 = new StringBuilder();
                for (int j = 0; j < len2 / i; j++) {
                    sb2.append(temp);
                }
                if (str2.equals(sb2.toString())) {
                    return temp;
                }
            }
        }
        return "";
    }
}
// @lc code=end
