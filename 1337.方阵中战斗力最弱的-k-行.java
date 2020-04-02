/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-02 17:21:32 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-02 17:21:32 
 */
/*
 * @lc app=leetcode.cn id=1337 lang=java
 *
 * [1337] 方阵中战斗力最弱的 K 行
 */

// @lc code=start
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        Integer[][] num = new Integer[mat.length][2];
        for (int i = 0; i < mat.length; i++) {
            num[i][0] = i;
            int cnt = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0) {
                    break;
                }
                cnt++;
            }
            num[i][1] = cnt;
        }
        Arrays.sort(num, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                if (o1[1].equals(o2[1])) {
                    {
                        return o1[0] - o2[0];
                    }
                }
                return o1[1] - o2[1];
            }
        });
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = num[i][0];
        }
        return res;
    }
}
// @lc code=end

