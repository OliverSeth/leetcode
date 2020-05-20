/*
 * @Author: Oliver Seth 
 * @Date: 2020-05-20 13:39:44 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-05-20 13:39:44 
 */
/*
 * @lc app=leetcode.cn id=1222 lang=java
 *
 * [1222] 可以攻击国王的皇后
 */

// @lc code=start
class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        int[][] move = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 }, { 1, 1 }, { -1, -1 }, { 1, -1 }, { -1, 1 } };
        List<List<Integer>> res = new ArrayList<>();
        for (int[] one : move) {
            int[] oneKing = new int[2];
            oneKing[0] = king[0];
            oneKing[1] = king[1];
            boolean isFound = false;
            while (oneKing[0] >= 0 && oneKing[0] <= 7 && oneKing[1] >= 0 && oneKing[1] <= 7) {
                for (int[] queen : queens) {
                    if (queen[0] == oneKing[0] && queen[1] == oneKing[1]) {
                        List<Integer> validQueen = new ArrayList<>();
                        for (int pos : queen) {
                            validQueen.add(pos);
                        }
                        res.add(validQueen);
                        isFound = true;
                        break;
                    }
                }
                if (isFound) {
                    break;
                }
                oneKing[0] += one[0];
                oneKing[1] += one[1];
            }
        }
        return res;
    }
}
// @lc code=end
