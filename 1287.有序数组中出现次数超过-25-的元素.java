/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-20 12:03:52 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-20 12:03:52 
 */
/*
 * @lc app=leetcode.cn id=1287 lang=java
 *
 * [1287] 有序数组中出现次数超过25%的元素
 */

// @lc code=start
class Solution {
    public int findSpecialInteger(int[] arr) {
        int num = arr.length / 4;
        int fre = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                if (fre > num) {
                    return arr[i - 1];
                }
                fre = 1;
            } else {
                fre++;
            }
        }
        return arr[arr.length - 1];
    }
}
// @lc code=end
