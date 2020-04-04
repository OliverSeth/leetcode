/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-04 20:36:50 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-04 20:36:50 
 */
/*
 * @lc app=leetcode.cn id=1385 lang=java
 *
 * [1385] 两个数组间的距离值
 */

// @lc code=start
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int left = 0;
        int right = 0;
        int cnt = 0;
        boolean isDiff = false;
        for (int i = 0; i < arr1.length; i++) {
            left = right;
            isDiff = false;
            while (left < arr2.length && arr2[left] <= arr1[i] + d) {
                if (Math.abs(arr1[i] - arr2[left]) <= d) {
                    isDiff = true;
                    break;
                }
                left++;
            }
            if (!isDiff) {
                cnt++;
            } else {
                right = left;
            }
        }
        return cnt;
    }
}
// @lc code=end

