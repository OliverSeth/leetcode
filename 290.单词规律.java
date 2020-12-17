/*
 * @Author: Oliver Seth 
 * @Date: 2020-12-16 10:54:10 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-12-16 11:01:21
 */
/*
 * @lc app=leetcode.cn id=290 lang=java
 *
 * [290] 单词规律
 */

// @lc code=start
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if (pattern.length() != arr.length) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (!map.containsKey(pattern.charAt(i))) {
                if (map.containsValue(arr[i])) {
                    return false;
                } else {
                    map.put(pattern.charAt(i), arr[i]);
                }
            } else {
                if (!map.get(pattern.charAt(i)).equals(arr[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
// @lc code=end

