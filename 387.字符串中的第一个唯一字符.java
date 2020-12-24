/*
 * @Author: Oliver Seth 
 * @Date: 2020-12-23 10:34:30 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-12-23 10:37:23
 */
/*
 * @lc app=leetcode.cn id=387 lang=java
 *
 * [387] 字符串中的第一个唯一字符
 */

// @lc code=start
class Solution {
    public int firstUniqChar(String s) {
        int[] pos = new int[26];
        boolean[] unique = new boolean[26];
        Arrays.fill(pos, -1);
        Arrays.fill(unique, true);
        for (int i = 0; i < s.length(); i++) {
            int temp = s.charAt(i) - 'a';
            if (pos[temp] != -1) {
                unique[temp] = false;
            } else {
                pos[temp] = i;
            }
        }
        int first = s.length();
        for (int i = 0; i < 26; i++) {
            if (unique[i] && pos[i] != -1) {
                first = Math.min(first, pos[i]);
            }
        }
        return first == s.length() ? -1 : first;
    }
}
// @lc code=end

