/*
 * @Author: Oliver Seth 
 * @Date: 2020-05-29 12:45:27 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-05-29 12:45:27 
 */
/*
 * @lc app=leetcode.cn id=1207 lang=java
 *
 * [1207] 独一无二的出现次数
 */

// @lc code=start
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int len = arr.length * 2;
        if (len != (int) (Math.sqrt(len)) * ((int) (Math.sqrt(len)) + 1)) {
            return false;
        }
        int[] occr = new int[2002];
        for (int i = 0; i < arr.length; i++) {
            occr[arr[i] + 1000]++;
        }
        boolean[] num = new boolean[50];
        for (int i = 0; i < occr.length; i++) {
            if (occr[i] != 0) {
                if (num[occr[i] - 1] == true) {
                    return false;
                }
                num[occr[i] - 1] = true;
            }
        }
        return true;
    }
}
// @lc code=end
