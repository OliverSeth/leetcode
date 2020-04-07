/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-07 17:56:22 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-07 17:56:22 
 */
/*
 * @lc app=leetcode.cn id=1329 lang=java
 *
 * [1329] 将矩阵按对角线排序
 */

// @lc code=start
class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int left = 0;
        int top = mat.length - 1;
        while (left < mat[0].length) {
            List<Integer> list = new ArrayList<>();
            int i = left;
            int j = top;
            while (j < mat.length && i < mat[0].length) {
                list.add(mat[j++][i++]);
            }
            list.sort((o1, o2) -> o1 - o2);
            i = left;
            j = top;
            for (Integer integer : list) {
                mat[j++][i++] = integer;
            }
            if (top == 0) {
                left++;
            } else {
                top--;
            }
        }
        return mat;
    }
}
// @lc code=end
