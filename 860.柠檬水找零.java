/*
 * @Author: Oliver Seth 
 * @Date: 2020-12-10 13:47:28 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-12-10 13:52:28
 */
/*
 * @lc app=leetcode.cn id=860 lang=java
 *
 * [860] 柠檬水找零
 */

// @lc code=start
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] cash = new int[2];
        for (int bill : bills) {
            if (bill == 5) {
                cash[0]++;
            } else if (bill == 10) {
                if (cash[0] == 0) {
                    return false;
                } else {
                    cash[0]--;
                    cash[1]++;
                }
            } else {
                if (cash[1] == 0) {
                    if (cash[0] < 3) {
                        return false;
                    } else {
                        cash[0] -= 3;
                    }
                } else {
                    if (cash[0] == 0) {
                        return false;
                    } else {
                        cash[0]--;
                        cash[1]--;
                    }
                }
            }
        }
        return true;
    }
}
// @lc code=end

