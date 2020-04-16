/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-16 11:51:13 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-16 11:51:13 
 */
/*
 * @lc app=leetcode.cn id=1300 lang=java
 *
 * [1300] 转变数组后最接近目标值的数组和
 */

// @lc code=start
class Solution {
    public int findBestValue(int[] arr, int target) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (target / (arr.length - i) <= arr[i]) {
                int num1 = target / (arr.length - i) * (arr.length - i);
                int num2 = (target / (arr.length - i) + 1) * (arr.length - i);
                if (target - num1 <= num2 - target) {
                    return target / (arr.length - i);
                } else {
                    return target / (arr.length - i) + 1;
                }
            }
            target -= arr[i];
        }
        return arr[arr.length - 1];
    }
}
// @lc code=end
