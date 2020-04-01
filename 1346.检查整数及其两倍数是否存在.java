/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-01 13:52:54 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-01 13:52:54 
 */
/*
 * @lc app=leetcode.cn id=1346 lang=java
 *
 * [1346] 检查整数及其两倍数是否存在
 */

// @lc code=start
class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0 && arr[i] >= arr[0] * 2; i--) {
            for (int j = 0; j < arr.length && 2 * arr[j] <= arr[i]; j++) {
                if (i != j && arr[i] == 2 * arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
// @lc code=end
