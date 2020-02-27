import java.util.ArrayList;
import java.util.List;

/*
 * @Author: Oliver Seth 
 * @Date: 2020-02-27 14:41:21 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-02-27 15:04:04
 */
class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        backTrack(res, new int[n], 0, n);
        return res;
    }

    private void backTrack(List<List<String>> res, int[] num, int index, int n) {
        if (index == n) {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                StringBuilder stringBuilder = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    if (num[i] == j) {
                        stringBuilder.append('Q');
                    } else {
                        stringBuilder.append('.');
                    }
                }
                list.add(stringBuilder.toString());
            }
            res.add(list);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (isValid(num, index, i)) {
                num[index] = i;
                backTrack(res, num, index + 1, n);
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