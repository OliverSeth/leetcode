/*
 * @Author: Oliver Seth 
 * @Date: 2020-10-12 11:56:28 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-10-12 11:56:28 
 */
/*
 * @lc app=leetcode.cn id=316 lang=java
 *
 * [316] 去除重复字母
 */

// @lc code=start
class Solution {
    public String removeDuplicateLetters(String s) {
        Map<Character, Integer> map = new HashMap<>();
        Stack<Character> stack = new Stack<>();
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
        }
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i))) {
                while (!stack.isEmpty()) {
                    if (stack.peek() > s.charAt(i) && map.get(stack.peek()) > i) {
                        set.remove(stack.pop());
                    } else {
                        break;
                    }
                }
                stack.push(s.charAt(i));
                set.add(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }
        return sb.toString();
    }
}
// @lc code=end

