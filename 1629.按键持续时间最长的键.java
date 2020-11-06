/*
 * @Author: Oliver Seth 
 * @Date: 2020-11-04 10:07:40 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-11-04 10:07:40 
 */
/*
 * @lc app=leetcode.cn id=1629 lang=java
 *
 * [1629] 按键持续时间最长的键
 */

// @lc code=start
class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int maxLen = releaseTimes[0];
        char key = keysPressed.charAt(0);
        for (int i = 1; i < keysPressed.length(); i++) {
            int len = releaseTimes[i] - releaseTimes[i - 1];
            if (len > maxLen) {
                maxLen = len;
                key = keysPressed.charAt(i);
            } else if (len == maxLen) {
                if (key < keysPressed.charAt(i)) {
                    key = keysPressed.charAt(i);
                }
            }
        }
        return key;
    }
}
// @lc code=end

