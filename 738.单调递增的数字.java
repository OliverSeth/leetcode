/*
 * @Author: Oliver Seth 
 * @Date: 2020-12-15 20:17:46 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-12-15 20:18:18
 */
/*
 * @lc app=leetcode.cn id=738 lang=java
 *
 * [738] 单调递增的数字
 */

// @lc code=start
class Solution {
    public int monotoneIncreasingDigits(int N) {
        char[] arr = String.valueOf(N).toCharArray();
        int pos = 1;
        while (pos < arr.length && arr[pos - 1] <= arr[pos]) {
            pos++;
        }
        while (pos > 0 && pos < arr.length && arr[pos - 1] > arr[pos]) {
            pos--;
            arr[pos]--;
        }
        for (int i = pos + 1; i < arr.length; i++) {
            arr[i] = '9';
        }
        return Integer.parseInt(String.valueOf(arr));
    }
}
// @lc code=end

