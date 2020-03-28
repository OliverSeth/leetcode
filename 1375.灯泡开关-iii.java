/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-28 17:15:29 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-03-28 17:15:29 
 */
/*
 * @lc app=leetcode.cn id=1375 lang=java
 *
 * [1375] 灯泡开关 III
 */

// @lc code=start
class Solution {
    public int numTimesAllBlue(int[] light) {
        int cnt = 0;
        int[] color = new int[light.length];
        for (int i = 0; i < light.length; i++) {
            color[light[i] - 1] = 1;
            if (light[i] == 1 || color[light[i] - 2] == 2) {
                int j = light[i] - 1;
                while (j < color.length && color[j] == 1) {
                    color[j++] = 2;
                }
                boolean isBlue = true;
                for (int k = j; k < color.length; k++) {
                    if (color[k] == 1) {
                        isBlue = false;
                        break;
                    }
                }
                if (isBlue) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
// @lc code=end

