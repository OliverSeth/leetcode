/*
 * @Author: Oliver Seth 
 * @Date: 2020-12-24 10:03:44 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-12-24 10:03:44 
 */
/*
 * @lc app=leetcode.cn id=556 lang=java
 *
 * [556] 下一个更大元素 III
 */

// @lc code=start
class Solution {
    public int nextGreaterElement(int n) {
        char[] num = String.valueOf(n).toCharArray();
        char maxNum = '0';
        boolean hasNext = false;
        for (int i = num.length - 1; i >= 0; i--) {
            if (maxNum > num[i]) {
                int temp = i + 1;
                for (int j = i + 1; j < num.length; j++) {
                    if (num[j] > num[i] && num[j] <= maxNum) {
                        maxNum = num[j];
                        temp = j;
                    }
                }
                num[i] ^= num[temp];
                num[temp] ^= num[i];
                num[i] ^= num[temp];
                Arrays.sort(num, i + 1, num.length);
                hasNext = true;
                break;
            } else {
                maxNum = num[i];
            }
        }
        long res = Long.parseLong(String.valueOf(num));
        return hasNext && res <= Integer.MAX_VALUE ? (int) res : -1;
    }
}
// @lc code=end

