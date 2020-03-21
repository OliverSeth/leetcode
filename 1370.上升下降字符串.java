/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-21 22:26:20 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-03-21 22:26:20 
 */
/*
 * @lc app=leetcode.cn id=1370 lang=java
 *
 * [1370] 上升下降字符串
 */

// @lc code=start
class Solution {
    public String sortString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            map.put((char) ('a' + i), 0);
        }
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
        }
        StringBuilder res = new StringBuilder();
        while (!isEnd(map)) {
            for (int i = 0; i < 26; i++) {
                if (map.get((char) ('a' + i)) != 0) {
                    res.append((char) ('a' + i));
                    map.put((char) ('a' + i), map.get((char) ('a' + i)) - 1);
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (map.get((char) ('a' + i)) != 0) {
                    res.append((char) ('a' + i));
                    map.put((char) ('a' + i), map.get((char) ('a' + i)) - 1);
                }
            }
        }
        return res.toString();
    }

    private boolean isEnd(Map<Character, Integer> map) {
        for (int i = 0; i < 26; i++) {
            if (map.get((char) ('a' + i)) != 0) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

