/*
 * @Author: Oliver Seth 
 * @Date: 2020-11-11 09:47:12 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-11-11 13:52:46
 */
/*
 * @lc app=leetcode.cn id=514 lang=java
 *
 * [514] 自由之路
 */

// @lc code=start
class Solution {
    public int findRotateSteps(String ring, String key) {
        int minStep = Integer.MAX_VALUE;
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < ring.length(); i++) {
            list.get(ring.charAt(i) - 'a').add(i);
        }
        int[][] dp = new int[key.length()][ring.length()];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = 10000;
            }
        }
        for (int i = 0; i < list.get(key.charAt(0) - 'a').size(); i++) {
            dp[0][list.get(key.charAt(0) - 'a').get(i)] = Math.min(list.get(key.charAt(0) - 'a').get(i), ring.length() - list.get(key.charAt(0) - 'a').get(i)) + 1;
        }
        for (int i = 1; i < key.length(); i++) {
            for (int j = 0; j < list.get(key.charAt(i) - 'a').size(); j++) {
                for (int k = 0; k < list.get(key.charAt(i - 1) - 'a').size(); k++) {
                    int len = Math.abs(list.get(key.charAt(i) - 'a').get(j) - list.get(key.charAt(i - 1) - 'a').get(k));
                    dp[i][list.get(key.charAt(i)-'a').get(j)] = Math.min(dp[i][list.get(key.charAt(i)-'a').get(j)], dp[i - 1][list.get(key.charAt(i - 1) - 'a').get(k)] + Math.min(len, ring.length() - len) + 1);
                    if (i == key.length() - 1) {
                        minStep = Math.min(minStep, dp[i][list.get(key.charAt(i)-'a').get(j)]);
                    }
                }
            }
        }
        return minStep;
    }
}
// @lc code=end

