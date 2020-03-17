import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-17 13:47:21 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-03-17 14:18:49
 */
/*
 * @lc app=leetcode.cn id=30 lang=java
 *
 * [30] 串联所有单词的子串
 */

// @lc code=start
class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> list = new ArrayList<>();
        if (words.length == 0) {
            return list;
        }
        int len = words.length * words[0].length();
        Map<String, Integer> oldMap = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (oldMap.containsKey(words[i])) {
                oldMap.put(words[i], oldMap.get(words[i]) + 1);
            } else {
                oldMap.put(words[i], 1);
            }
        }
        for (int i = 0; i <= s.length() - len; i++) {
            Map<String, Integer> newMap = new HashMap<>();
            boolean isValid = true;
            for (int j = 0; j < words.length; j++) {
                String temp = s.substring(i + j * words[0].length(), i + (j + 1) * words[0].length());
                if (newMap.containsKey(temp)) {
                    newMap.put(temp, newMap.get(temp) + 1);
                } else {
                    newMap.put(temp, 1);
                }
                if (!oldMap.containsKey(temp) || oldMap.get(temp) < newMap.get(temp)) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                list.add(i);
            }
        }
        return list;
    }
}
// @lc code=end
