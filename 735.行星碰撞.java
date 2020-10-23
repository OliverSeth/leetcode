/*
 * @Author: Oliver Seth 
 * @Date: 2020-10-23 10:38:53 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-10-23 10:38:53 
 */
/*
 * @lc app=leetcode.cn id=735 lang=java
 *
 * [735] 行星碰撞
 */

// @lc code=start
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            if (stack.isEmpty() || asteroid * stack.peek() > 0 || asteroid > 0 && stack.peek() < 0) {
                stack.push(asteroid);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() + asteroid < 0) {
                    stack.pop();
                }
                if (stack.isEmpty()) {
                    stack.push(asteroid);
                } else if (stack.peek() + asteroid == 0) {
                    stack.pop();
                } else if (stack.peek() < 0 && asteroid < 0) {
                    stack.push(asteroid);
                }
            }
        }
        int[] res = new int[stack.size()];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        return res;
    }
}
// @lc code=end

