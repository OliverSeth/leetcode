/*
 * @Author: Oliver Seth 
 * @Date: 2020-11-26 21:17:58 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-11-26 21:17:58 
 */
/*
 * @lc app=leetcode.cn id=395 lang=java
 *
 * [395] 至少有K个重复字符的最长子串
 */

// @lc code=start
class Solution {
    public int longestSubstring(String s, int k) {
        if (s.length() == 0) {
            return 0;
        }
        if (k < 2) {
            return s.length();
        }
        return divide(s, k, 0, s.length() - 1);
    }

    private int divide(String s, int k, int start, int end) {
        if (end - start + 1 < k) {
            return 0;
        }
        int[] arr = new int[26];
        for (int i = start; i <= end; i++) {
            arr[s.charAt(i) - 'a']++;
        }
        while (end - start + 1 >= k && arr[s.charAt(start) - 'a'] < k) {
            start++;
        }
        while (end - start + 1 >= k && arr[s.charAt(end) - 'a'] < k) {
            end--;
        }
        if (end - start + 1 < k) {
            return 0;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (arr[s.charAt(i) - 'a'] < k) {
                list.add(i);
            }
        }
        if (list.isEmpty()) {
            return end - start + 1;
        }
        int maxCount = 0;
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                maxCount = Math.max(maxCount, divide(s, k, start, list.get(0)));
            }
            if (i == list.size() - 1) {
                maxCount = Math.max(maxCount, divide(s, k, list.get(list.size() - 1), end));
            } else {
                maxCount = Math.max(maxCount, divide(s, k, list.get(i), list.get(i + 1)));
            }
        }
        return maxCount;
    }
}
// @lc code=end

