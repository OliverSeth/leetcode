/*
 * @Author: Oliver Seth 
 * @Date: 2020-12-15 10:56:01 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-12-15 10:56:01 
 */
/*
 * @lc app=leetcode.cn id=131 lang=java
 *
 * [131] 分割回文串
 */

// @lc code=start
class Solution {

    private List<List<String>> res;

    public List<List<String>> partition(String s) {
        res = new ArrayList<>();
        helper(new ArrayList<>(), s);
        return res;
    }

    private void helper(List<String> one, String s) {
        if (s.length() == 0) {
            res.add(new ArrayList<>(one));
            return;
        }
        for (int i = 1; i <= s.length(); i++) {
            if (isPalindrome(s.substring(0, i))) {
                one.add(s.substring(0, i));
                helper(one, s.substring(i));
                one.remove(one.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
// @lc code=end

