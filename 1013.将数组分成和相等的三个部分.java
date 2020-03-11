/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-11 15:00:23 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-03-11 15:13:31
 */
/*
 * @lc app=leetcode.cn id=1013 lang=java
 *
 * [1013] 将数组分成和相等的三个部分
 */

// @lc code=start
class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        if (sum % 3 != 0) {
            return false;
        }
        int left = -1;
        int right = A.length;
        int lsum = 0;
        int rsum = 0;
        while (left < right) {
            if (lsum * 3 != sum || left == -1) {
                left++;
                lsum += A[left];
            }
            if (rsum * 3 != sum || right == A.length) {
                right--;
                rsum += A[right];
            }
            if (lsum == rsum && lsum * 3 == sum) {
                break;
            }
        }
        if (Math.abs(left - right) <= 1) {
            return false;
        } else {
            return true;
        }
    }
}
// @lc code=end
