/*
 * @Author: Oliver Seth 
 * @Date: 2020-12-11 14:45:07 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-12-11 14:45:47
 */
/*
 * @lc app=leetcode.cn id=649 lang=java
 *
 * [649] Dota2 参议院
 */

// @lc code=start
class Solution {
    public String predictPartyVictory(String senate) {
        return helper(senate, new int[2]);
    }

    private String helper(String senate, int[] num) {
        StringBuilder sb = new StringBuilder();
        boolean haveR = false;
        boolean haveD = false;
        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R') {
                haveR = true;
                if (num[1] > 0) {
                    num[1]--;
                } else {
                    num[0]++;
                    sb.append('R');
                }
            } else {
                haveD = true;
                if (num[0] > 0) {
                    num[0]--;
                } else {
                    num[1]++;
                    sb.append('D');
                }
            }
        }
        if (!haveR) {
            return "Dire";
        }
        if (!haveD) {
            return "Radiant";
        }
        return helper(sb.toString(), num);
    }
}
// @lc code=end

