/*
 * @Author: Oliver Seth 
 * @Date: 2020-12-06 17:09:12 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-12-06 17:09:12 
 */
/*
 * @lc app=leetcode.cn id=605 lang=java
 *
 * [605] 种花问题
 */

// @lc code=start
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if ((i == 0 || flowerbed[i - 1] == 0) && flowerbed[i] == 0 && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                n--;
                if (n <= 0) {
                    return true;
                }
            }
        }
        return n == 0;
    }
}
// @lc code=end

