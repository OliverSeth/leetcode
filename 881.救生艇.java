/*
 * @Author: Oliver Seth 
 * @Date: 2021-01-14 13:48:14 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2021-01-14 13:48:14 
 */
/*
 * @lc app=leetcode.cn id=881 lang=java
 *
 * [881] 救生艇
 */

// @lc code=start
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int cnt = 0;
        int left = 0;
        int right = people.length - 1;
        Arrays.sort(people);
        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
            }
            right--;
            cnt++;
        }
        return cnt;
    }
}
// @lc code=end

