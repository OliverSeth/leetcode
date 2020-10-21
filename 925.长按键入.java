/*
 * @Author: Oliver Seth 
 * @Date: 2020-10-21 11:01:00 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-10-21 11:01:00 
 */
/*
 * @lc app=leetcode.cn id=925 lang=java
 *
 * [925] 长按键入
 */

// @lc code=start
class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int posN = 0;
        int posT = 0;
        while (posN < name.length() || posT < typed.length()) {
            if (posT == typed.length()) {
                return false;
            }
            if (posN == name.length()) {
                if (name.charAt(posN - 1) == typed.charAt(posT)) {
                    posT++;
                } else {
                    return false;
                }
            } else if (name.charAt(posN) == typed.charAt(posT)) {
                posN++;
                posT++;
            } else if (posN != 0 && name.charAt(posN - 1) == typed.charAt(posT)) {
                posT++;
            } else {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

