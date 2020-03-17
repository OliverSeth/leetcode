import java.util.HashMap;
import java.util.Map;

/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-17 14:22:07 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-03-17 14:33:43
 */
/*
 * @lc app=leetcode.cn id=1160 lang=java
 *
 * [1160] 拼写单词
 */

// @lc code=start
class Solution {
    public int countCharacters(String[] words, String chars) {
        int len = 0;
        if (words.length == 0) {
            return len;
        }
        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < chars.length(); i++) {
            if (charMap.containsKey(chars.charAt(i))) {
                charMap.put(chars.charAt(i), charMap.get(chars.charAt(i)) + 1);
            } else {
                charMap.put(chars.charAt(i), 1);
            }
        }
        for (int i = 0; i < words.length; i++) {
            Map<Character, Integer> wordMap = new HashMap<>();
            boolean isValid = true;
            for (int j = 0; j < words[i].length(); j++) {
                if (wordMap.containsKey(words[i].charAt(j))) {
                    wordMap.put(words[i].charAt(j), wordMap.get(words[i].charAt(j)) + 1);
                } else {
                    wordMap.put(words[i].charAt(j), 1);
                }
                if (!charMap.containsKey(words[i].charAt(j))
                        || charMap.get(words[i].charAt(j)) < wordMap.get(words[i].charAt(j))) {
                    isValid = false;
                    break;
                }
            }
            if (isValid) {
                len += words[i].length();
            }
        }
        return len;
    }
}
// @lc code=end
