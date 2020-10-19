/*
 * @Author: Oliver Seth 
 * @Date: 2020-10-19 12:30:17 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-10-19 12:30:17 
 */
/*
 * @lc app=leetcode.cn id=844 lang=java
 *
 * [844] 比较含退格的字符串
 */

// @lc code=start
class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();
        helper(S, stackS);
        helper(T, stackT);
        while (!stackS.isEmpty() && !stackT.isEmpty()) {
            if (stackS.pop() != stackT.pop()) {
                return false;
            }
        }
        return stackS.isEmpty() && stackT.isEmpty();
    }

    private void helper(String s, Stack<Character> stack) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.push(s.charAt(i));
            }
        }
    }
}
// @lc code=end

