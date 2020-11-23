/*
 * @Author: Oliver Seth 
 * @Date: 2020-11-22 13:44:12 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-11-22 13:46:29
 */
/*
 * @lc app=leetcode.cn id=242 lang=java
 *
 * [242] 有效的字母异位词
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr1[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            arr2[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

