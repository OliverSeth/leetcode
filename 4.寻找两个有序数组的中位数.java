/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-10 13:50:13 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-03-10 15:00:42
 */
/*
 * @lc app=leetcode.cn id=4 lang=java
 *
 * [4] 寻找两个有序数组的中位数
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        if (m == 0 && n == 0) {
            return 0;
        }
        boolean isEven = (m + n) % 2 == 0;
        if (m > n) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int imin = 0;
        int imax = m;
        while (imin <= imax) {
            int i = (imin + imax) / 2;
            int j = (m + n + 1) / 2 - i;
            if (j != 0 && i != m && nums1[i] < nums2[j - 1]) {
                imin = i + 1;
            } else if (i != 0 && nums1[i - 1] > nums2[j]) {
                imax = i - 1;
            } else {
                int left = 0;
                if (i == 0) {
                    left = nums2[j - 1];
                } else if (j == 0) {
                    left = nums1[i - 1];
                } else {
                    left = Math.max(nums1[i - 1], nums2[j - 1]);
                }
                if (!isEven) {
                    return left;
                }
                int right = 0;
                if (i == m) {
                    right = nums2[j];
                } else if (j == n) {
                    right = nums1[i];
                } else {
                    right = Math.min(nums1[i], nums2[j]);
                }
                return ((double) (left + right)) / 2;
            }
        }
        return 0;
    }
}
// @lc code=end
