/*
 * @Author: Oliver Seth 
 * @Date: 2020-12-08 12:26:46 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-12-08 12:26:46 
 */
/*
 * @lc app=leetcode.cn id=842 lang=java
 *
 * [842] 将数组拆分成斐波那契序列
 */

// @lc code=start
class Solution {
    public List<Integer> splitIntoFibonacci(String S) {
        List<Integer> list = new ArrayList<>();
        helper(S, list, 0, 0, 0);
        return list;
    }

    private boolean helper(String s, List<Integer> list, int index, int sum, int pre) {
        if (index == s.length()) {
            return list.size() >= 3;
        }
        long tmp = 0;
        for (int i = index; i < s.length(); i++) {
            if (i > index && s.charAt(index) == '0') {
                break;
            }
            tmp = tmp * 10 + s.charAt(i) - '0';
            if (tmp > Integer.MAX_VALUE) {
                break;
            }
            if (list.size() >= 2) {
                if (tmp > sum) {
                    break;
                } else if (tmp < sum) {
                    continue;
                }
            }
            list.add((int) tmp);
            if (helper(s, list, i + 1, pre + (int) tmp, (int) tmp)) {
                return true;
            } else {
                list.remove(list.size() - 1);
            }
        }
        return false;
    }
}
// @lc code=end

