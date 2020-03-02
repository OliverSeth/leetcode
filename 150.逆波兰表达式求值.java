import java.util.Stack;

/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-02 17:52:43 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-03-02 18:43:35
 */
/*
 * @lc app=leetcode.cn id=150 lang=java
 *
 * [150] 逆波兰表达式求值
 */

// @lc code=start
class Solution {
    public int evalRPN(String[] tokens) {
        if (tokens.length == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        for (String str : tokens) {
            if (str.length() > 1 || (str.getBytes()[0] >= '0' && str.getBytes()[0] <= '9')) {
                stack.push(Integer.valueOf(str));
            } else {
                switch (str) {
                    case "+":
                        stack.push(stack.pop() + stack.pop());
                        break;
                    case "-":
                        Integer num1 = stack.pop();
                        stack.push(stack.pop() - num1);
                        break;
                    case "*":
                        stack.push(stack.pop() * stack.pop());
                        break;
                    case "/":
                        Integer num2 = stack.pop();
                        stack.push(stack.pop() / num2);
                        break;
                }
            }
        }
        return stack.pop();
    }
}
// @lc code=end
