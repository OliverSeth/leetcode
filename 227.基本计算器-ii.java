/*
 * @Author: Oliver Seth 
 * @Date: 2020-11-25 13:41:38 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-11-25 14:17:49
 */
/*
 * @lc app=leetcode.cn id=227 lang=java
 *
 * [227] 基本计算器 II
 */

// @lc code=start
class Solution {
    public int calculate(String s) {
        s = s.replace(" ", "");
        Deque<Integer> num = new LinkedList<>();
        Queue<Character> operator = new LinkedList<>();
        int tmp = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '*' || c == '/') {
                int num1 = tmp;
                i++;
                int num2 = 0;
                while (i < s.length() && s.charAt(i) <= '9' && s.charAt(i) >= '0') {
                    num2 = num2 * 10 + s.charAt(i) - '0';
                    i++;
                }
                i--;
                if (c == '*') {
                    num1 *= num2;
                } else {
                    num1 /= num2;
                }
                tmp = num1;
            } else if (c == '+' || c == '-') {
                num.offerLast(tmp);
                tmp = 0;
                operator.offer(c);
            } else {
                tmp = tmp * 10 + c - '0';
            }
        }
        num.offerLast(tmp);
        int res = num.pollFirst();
        while (!operator.isEmpty()) {
            char c = operator.poll();
            if (c == '+') {
                res += num.pollFirst();
            } else {
                res -= num.pollFirst();
            }
        }
        return res;
    }
}
// @lc code=end

