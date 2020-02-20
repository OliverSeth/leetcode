/*
 * @Author: Oliver Seth 
 * @Date: 2020-02-20 13:36:13 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-02-20 14:52:10
 */
/*
 * @lc app=leetcode.cn id=43 lang=java
 *
 * [43] 字符串相乘
 */

// @lc code=start
class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        StringBuilder sum = new StringBuilder();
        int num;
        int ans = 0;
        for (int i = num1.length() - 1; i >= 0; i--) {
            StringBuilder one = new StringBuilder();
            for (int j = num2.length() - 1; j >= 0; j--) {
                num = (num1.charAt(i) - '0') * (num2.charAt(j) - '0') + ans;
                ans = num / 10;
                one.insert(0, num % 10);
            }
            if (ans != 0) {
                one.insert(0, ans);
                ans = 0;
            }
            for (int k = 0; k < (num1.length() - 1 - i); k++) {
                one.append("0");
            }
            sum = plus(one, sum);
        }
        return sum.toString();
    }

    private StringBuilder plus(StringBuilder num1, StringBuilder num2) {
        if (num1.length() < num2.length()) {
            StringBuilder temp = num1;
            num1 = num2;
            num2 = temp;
        }
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int ans = 0;
        int num = 0;
        StringBuilder sum = new StringBuilder();
        for (; i >= 0; i--) {
            if (j < 0) {
                if (ans == 0) {
                    sum.insert(0, num1.charAt(i));
                } else {
                    num = (num1.charAt(i) - '0') + ans;
                    ans = num / 10;
                    sum.insert(0, num % 10);
                }
            } else {
                num = (num1.charAt(i) - '0') + (num2.charAt(j) - '0') + ans;
                ans = num / 10;
                sum.insert(0, num % 10);
            }
            j--;
        }
        if (ans != 0) {
            sum.insert(0, ans);
        }
        return sum;
    }
}
// @lc code=end
