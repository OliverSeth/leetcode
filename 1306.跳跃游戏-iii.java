/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-15 12:12:12 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-15 12:12:12 
 */
/*
 * @lc app=leetcode.cn id=1306 lang=java
 *
 * [1306] 跳跃游戏 III
 */

// @lc code=start
class Solution {
    private boolean[] isJumped;

    public boolean canReach(int[] arr, int start) {
        isJumped = new boolean[arr.length];
        return jump(arr, start);
    }

    private boolean jump(int[] arr, int start) {
        if (arr[start] == 0) {
            return true;
        }
        isJumped[start] = true;
        boolean left = false;
        boolean right = false;
        if (start - arr[start] >= 0 && !isJumped[start - arr[start]]) {
            left = jump(arr, start - arr[start]);
        }
        if (start + arr[start] < arr.length && !isJumped[start + arr[start]]) {
            right = jump(arr, start + arr[start]);
        }
        return left || right;
    }
}
// @lc code=end
