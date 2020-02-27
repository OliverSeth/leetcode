/*
 * @Author: Oliver Seth 
 * @Date: 2020-02-27 15:06:34 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-02-27 15:09:44
 */
class Solution {
    private int total = 0;

    public int totalNQueens(int n) {
        backTrack(new int[n], 0, n);
        return total;
    }

    private void backTrack(int[] num, int index, int n) {
        if (index == n) {
            total++;
            return;
        }
        for (int i = 0; i < n; i++) {
            if (isValid(num, index, i)) {
                num[index] = i;
                backTrack(num, index + 1, n);
            }
        }
    }

    private boolean isValid(int[] num, int m, int n) {
        for (int i = 0; i < m; i++) {
            if (num[i] == n) {
                return false;
            }
            if (Math.abs(m - i) == Math.abs(n - num[i])) {
                return false;
            }
        }
        return true;
    }
}