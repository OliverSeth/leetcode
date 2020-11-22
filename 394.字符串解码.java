/*
 * @Author: Oliver Seth 
 * @Date: 2020-11-20 13:31:18 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-11-20 14:00:34
 */
/*
 * @lc app=leetcode.cn id=394 lang=java
 *
 * [394] 字符串解码
 */

// @lc code=start
class Solution {
    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ']') {
                StringBuilder tmp = new StringBuilder();
                char c = stack.pop();
                while (c != '[') {
                    tmp.insert(0, c);
                    c = stack.pop();
                }
                int pos = 1;
                while (!stack.isEmpty() && stack.peek() >= '0' && stack.peek() <= '9') {
                    num += pos * (stack.pop() - '0');
                    pos *= 10;
                }
                if (stack.isEmpty()) {
                    for (int j = 0; j < num; j++) {
                        sb.append(tmp);
                    }
                } else {
                    for (int j = 0; j < num; j++) {
                        for (int k = 0; k < tmp.length(); k++) {
                            stack.push(tmp.charAt(k));
                        }
                    }
                }
                num = 0;
            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                if (!stack.isEmpty()) {
                    stack.push(s.charAt(i));
                } else {
                    sb.append(s.charAt(i));
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
// @lc code=end

